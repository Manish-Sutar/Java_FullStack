package org.example.webobapp.repo;

import org.example.webobapp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JobRepo {

    @Autowired
    private JdbcTemplate jdbc;

    public void save(JobPost jobPost) {
        // 1. Insert or update existing job post if postId already exists
        String sql = "INSERT INTO job_post (post_id, post_profile, post_desc, req_experience) " +
                "VALUES (?, ?, ?, ?) " +
                "ON CONFLICT (post_id) DO UPDATE SET " +
                "post_profile = EXCLUDED.post_profile, " +
                "post_desc = EXCLUDED.post_desc, " +
                "req_experience = EXCLUDED.req_experience";
        jdbc.update(sql, jobPost.getPostId(), jobPost.getPostProfile(), jobPost.getPostDesc(), jobPost.getReqExperience());

        // 2. Update tech stack items
        if (jobPost.getPostTechStack() != null) {
            // Delete old tech stack tags for this post to prevent duplicates
            jdbc.update("DELETE FROM job_post_tech_stack WHERE job_post_id = ?", jobPost.getPostId());

            String techSql = "INSERT INTO job_post_tech_stack (job_post_id, tech_stack) VALUES (?, ?)";
            for (String tech : jobPost.getPostTechStack()) {
                jdbc.update(techSql, jobPost.getPostId(), tech);
            }
        }
    }

    public List<JobPost> getAllJobs() {
        String sql = "SELECT * FROM job_post";

        RowMapper<JobPost> mapper = new RowMapper<JobPost>() {
            @Override
            public JobPost mapRow(ResultSet rs, int rowNum) throws SQLException {
                JobPost post = new JobPost();
                post.setPostId(rs.getInt("post_id"));
                post.setPostProfile(rs.getString("post_profile"));
                post.setPostDesc(rs.getString("post_desc"));
                post.setReqExperience(rs.getInt("req_experience"));

                String techSql = "SELECT tech_stack FROM job_post_tech_stack WHERE job_post_id = ?";
                List<String> techList = jdbc.query(techSql, (rsTech, rNum) -> rsTech.getString("tech_stack"), post.getPostId());
                post.setPostTechStack(techList);

                return post;
            }
        };

        return jdbc.query(sql, mapper);
    }
}
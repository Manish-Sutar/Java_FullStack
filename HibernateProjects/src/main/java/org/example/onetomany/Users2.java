package org.example.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Users2 {
    @Id
    private int id;
    private String name;
    private String tech;

    @OneToMany
    private List<Laptops> laptops;
}

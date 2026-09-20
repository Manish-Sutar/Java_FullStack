package org.example.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Laptops {
    @Id
    private int id;
    private String name;
    private int ram;

    @ManyToOne
    Users2 user;



}

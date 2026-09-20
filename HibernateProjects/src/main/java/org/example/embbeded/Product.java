package org.example.embbeded;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    private int id;
    private String name;
    private int ram;

    @Transient
    private int stock;
    }

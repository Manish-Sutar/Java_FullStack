package org.example.transistExample;

import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    private int id;
    private String name;
    @Transient
    private int ram;

    @Transient
    private int stock;
}

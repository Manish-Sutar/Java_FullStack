package org.example.onetoonemapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Laptop {
    @Id
    private  int id;
    private String name;
    private int ram ;
}

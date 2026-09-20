package org.example.onetoonemapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class User1 {
    @Id
    private int id;
    private String name;
    private String tech;
    private int sal;
    @OneToMany
    private Laptop laptop;
}

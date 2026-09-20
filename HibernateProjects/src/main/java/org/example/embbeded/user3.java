package org.example.embbeded;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class user3 {

    @Id
    private int id;
    private String name;
    private String tech;
    @Embedded
    private Product product;

}

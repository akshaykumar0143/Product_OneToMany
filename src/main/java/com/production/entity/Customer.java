package com.production.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String Gender;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
   @JoinColumn(name = "CusProd_foreignKey", referencedColumnName = "id")

    private List<Product> products;
}

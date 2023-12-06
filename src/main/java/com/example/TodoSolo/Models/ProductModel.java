package com.example.TodoSolo.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(schema = "Product")
@Data
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String productName;
    @Column
    private String productDescription;
    @Column
    private String imgUrl;
}

package com.example.TodoSolo.Repository;

import com.example.TodoSolo.Models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel,Long> {
}

package com.example.TodoSolo.Repository;

import com.example.TodoSolo.Models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel,Long> {
    @Query("SELECT p FROM ProductModel p ORDER BY RAND()")
    List<ProductModel> findRandomProducts();
}

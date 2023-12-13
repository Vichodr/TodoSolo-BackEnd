package com.example.TodoSolo.Services;
import com.example.TodoSolo.Models.ProductModel;
import com.example.TodoSolo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public String AddProduct(@RequestBody ProductModel productModel){
        productRepository.save(productModel);
        return "Producto agregado correctamente";
    }
    public List<ProductModel> ListProduct(){
        return productRepository.findAll();
    }
    public Optional<ProductModel> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public String deleteProductById(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Producto eliminado correctamente";
        } else {
            return "Producto no encontrado";
        }
    }
    public List<ProductModel> getRandomProducts() {
        List<ProductModel> allProducts = productRepository.findAll(); // Obtén todos los productos
        Collections.shuffle(allProducts); // Baraja la lista de productos
        int numberOfRandomProducts = 5; // Cambia según tus necesidades
        return allProducts.subList(0, numberOfRandomProducts); // Obtén los primeros N productos aleatorios
    }
}

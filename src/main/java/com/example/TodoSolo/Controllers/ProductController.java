package com.example.TodoSolo.Controllers;
import com.example.TodoSolo.Models.ProductModel;
import com.example.TodoSolo.Services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Product")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping(value = "/showAllProducts")
    public List<ProductModel> getAllProducts(){
        return productService.ListProduct();
    }

    @CrossOrigin
    @PostMapping(value = "/addProduct")
    public String postOneProduct(@RequestBody ProductModel productModel){
        return productService.AddProduct(productModel);
    }

    @GetMapping(value = "/getProductById/{id}")
    public Optional<ProductModel> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping(value = "/deleteProductById/{id}")
    public String deleteProductById(@PathVariable Long id) {
        return productService.deleteProductById(id);
    }
}

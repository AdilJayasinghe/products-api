package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.GetProductById(id).orElse(null);
    }

    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name) {
        return productService.FindByName(name);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.AddProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.DeleteProductById(id);
    }

}

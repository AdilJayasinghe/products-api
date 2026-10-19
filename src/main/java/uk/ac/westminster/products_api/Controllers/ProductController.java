package uk.ac.westminster.products_api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Service.ProductService;
import uk.ac.westminster.products_api.Product;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.GetProductById(id).orElse(null);
    }

    @GetMapping("/search")
    public List<Product> search(@RequestParam String name) {
        return productService.FindByName(name);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.AddProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.DeleteProductById(id);
    }

}

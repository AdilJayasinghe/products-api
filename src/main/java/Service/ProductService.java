package Service;

import org.springframework.stereotype.Service;
import uk.ac.westminster.products_api.DigitalProduct;
import uk.ac.westminster.products_api.PhysicalProduct;
import uk.ac.westminster.products_api.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        System.out.println("Yiee added");
        products.add(new DigitalProduct(nextId++,"GTA VI",99.99,"HTTPS/GTAVI/ROCKSTAR",12400.0));
        products.add(new PhysicalProduct(nextId++,"Mouse",29.99,.500,"10x10cm"));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product AddProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> GetProductById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void DeleteProductById(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> FindByName(String name) {
        return products.stream().filter(p -> p.getName().contains(name)).toList();
    }
}

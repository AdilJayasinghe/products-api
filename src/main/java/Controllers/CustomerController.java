package Controllers;

import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.Address;
import uk.ac.westminster.products_api.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){
        Address address = new Address("115 New Cavendish Street","London","W1W 6UW");

        return new Customer(id, "Ada Lovelace","awaLovelace@gmail.com", address);
    }
}

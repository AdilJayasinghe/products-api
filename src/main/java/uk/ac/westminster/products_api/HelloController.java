package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * Week 1 starter controller.
 * Already provided:
 *   GET /hello   -> a simple greeting
 *   GET /status  -> a simple status message
 * TODO (Lab Activity 3):
 *   Add a new endpoint GET /goodbye that returns the String
 *   "Goodbye from Spring Boot!"
 */

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boots!";
    }

    @GetMapping("/status")
    public String status(){
        return "API running -" + LocalDate.now().toString();
    }

    @GetMapping("/goodbye")
    public String goodbye(){return "Goodbye from Spring Boots!";}

    // TODO (Activity 3): add your /goyodbye endpoint here.
    @GetMapping("InfoController")
    public String InfoController(){return LocalDate.now().toString();}

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable int id) {
        return new Person(id,"John","email");
    }

    //@GetMapping
    //PUBLIC IST<product>Get Product

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person p) {
        return p;
    }
}
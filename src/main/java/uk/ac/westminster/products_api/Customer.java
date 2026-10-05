package uk.ac.westminster.products_api;

public class Customer {
    private Long id;
    private String Name;
    private String Email;
    private Address Address;

    public Customer(){}

    public Customer(Long id, String name, String email, Address address){
        this.id = id;
        this.Name = name;
        this.Email = email;
        this.Address = address;
    }

    public Long getId() {
        return id;
    }
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return Email;
    }
    public Address getAddress(){
        return Address;
    }
}

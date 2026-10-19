package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private double weight;
    private String dimension;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price, double weight, String dimension) {
        super(id, name, price);
        this.weight = weight;
        this.dimension = dimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    //A PhysicalProduct IS-A Product
    //because it extends out of the Product class. a Customer cannot be extended from Product as they
    // dont share an id name and price
}

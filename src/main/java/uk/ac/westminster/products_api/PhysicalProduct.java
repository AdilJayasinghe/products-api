package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private double weight;
    private String dimension;
    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

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

    @Override
    public String getSummary(){
        return "Digital: " + getName() + " | Weight: " + getWeight();
    }
}

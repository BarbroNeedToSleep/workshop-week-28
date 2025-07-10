package se.lexicon.model;

public abstract class Product {

    private static int productIdCounter = 0;

    private int id;
    private double price;
    private String productName;

    public Product(double price, String productName) {
        this.id = ++productIdCounter;
        this.price = price;
        setProductName(productName);
    }

    //Getters

    public int getNextId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    //Setter


    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {

        if (productName == null || productName.trim().isEmpty()){
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }

        this.productName = productName;
    }

    public String toString(){
        StringBuilder summary = new StringBuilder();
        summary.append("product Info- ID: ").append(id)
                .append(", Name: ").append(productName)
                .append(", Price : ").append(price);
        return summary.toString();

    }

    public abstract String examina ();

    public abstract String use();

}

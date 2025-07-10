package se.lexicon.model;

public class Chocolate extends Product{

    private ChocolateType type;

    public Chocolate(double price, String productName, ChocolateType type) {
        super(price, productName);
        setType(type);

    }

    //Getters

    public ChocolateType getType() {
        return type;
    }

    //Setter


    public void setType(ChocolateType type) {
        this.type = type;
    }

    @Override
    public String toString(){
        StringBuilder summary = new StringBuilder();
        summary.append("Product Info- ID: ").append(getId())
                .append(", Name: ").append(getProductName())
                .append(", Type: ").append(getType())
                .append(", Price : ").append(getPrice());
        return summary.toString();

    }



    @Override
    public String examine() {

        return "Product: " + getProductName() + ", of the type "+ getType() + " at " + getPrice()+"kr";
    }


    @Override
    public String use() {
        return "Cholate is good for the body";
    }
}

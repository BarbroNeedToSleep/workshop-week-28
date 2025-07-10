package se.lexicon.model;

public class Chocolate extends Product{

    private Chocolate type;

    public Chocolate(double price, String productName, Chocolate type) {
        super(price, productName);
        this.type=type;

    }

    //Getters

    public Chocolate getType() {
        return type;
    }

    //Setter


    public void setType(Chocolate type) {
        this.type = type;
    }

    @Override
    public String examina() {
        return "";
    }

    @Override
    public String use() {
        return "";
    }
}

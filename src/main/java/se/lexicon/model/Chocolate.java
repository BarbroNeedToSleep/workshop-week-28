package se.lexicon.model;

public class Chocolate extends Product{

    private ChoclateType type;

    public Chocolate(double price, String productName, ChoclateType type) {
        super(price, productName);
        setType(type);

    }

    //Getters

    public ChoclateType getType() {
        return type;
    }

    //Setter


    public void setType(ChoclateType type) {
        this.type = type;
    }

    @Override
    public String toString(){
        StringBuilder summary = new StringBuilder();
        summary.append("product Info- ID: ").append(getNextId())
                .append(", Name: ").append(getProductName())
                .append(", Type: ").append(getType())
                .append(", Price : ").append(getPrice());
        return summary.toString();

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

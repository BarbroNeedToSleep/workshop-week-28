package se.lexicon.model;

public class Soda extends Product{

    private boolean isSugarFree;

    public Soda(double price, String productName, boolean isSugarFree) {
        super(price, productName);
        this.isSugarFree=isSugarFree;

    }

    //Getters

    public boolean isSugarFree() {
        return isSugarFree;
    }

    //Setter


    public void setSugarFree(boolean sugarFree) {
        isSugarFree = sugarFree;
    }

    @Override
    public String toString(){
        StringBuilder summary = new StringBuilder();
        summary.append("product Info- ID: ").append(getId())
                .append(", Name: ").append(getProductName())
                .append(", Suger free: ").append(isSugarFree ? "Yes" : "No")
                .append(", Price : ").append(getPrice());
        return summary.toString();

    }

    @Override
    public String examine() {

        return "Product: " + getProductName() + ", of the type "+ (isSugarFree ? "Contains suger" : "is suger free") + " at " + getPrice()+"kr";
    }


    @Override
    public String use() {
        return "Can course that your teeth rot";
    }
}

package se.lexicon.model;

public class Candy extends Product{

    private boolean isSugarFree;

    public Candy(double price, String productName, boolean isSugarFree) {
        super(price, productName);
        this.isSugarFree = isSugarFree;}

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
        summary.append("product Info- ID: ").append(getNextId())
                .append(", Name: ").append(getProductName())
                .append(", Suger free: ").append(isSugarFree ? "Yes" : "No")
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

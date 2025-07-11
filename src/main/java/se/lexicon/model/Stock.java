package se.lexicon.model;

public class Stock {

    public static final Candy lemon = new Candy(15.00, "Lemon drops", true);
    public static final Candy strawberry = new Candy(12.00, "Strawberry delight", false);
    public static final Soda cola = new Soda(20.00, "Cola", false);
    public static final Soda cubaCola = new Soda(20.00, "Cuba cola", true);
    public static final Chocolate center = new Chocolate(22.00, "Center", ChocolateType.milk);


    public static Product[] getAllProducts() {
        return new Product[]{lemon, cola, center, strawberry, cubaCola};

    }

    // VendingMachineImpl vendingMachine = new VendingMachineImpl(0, getAllProducts());
}

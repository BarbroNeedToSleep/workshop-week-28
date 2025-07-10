package se.lexicon;

import se.lexicon.model.*;


public class Main {
    public static void main(String[] args) {




        Product[] products = Stock.getAllProducts();

        System.out.println(Stock.center.examine());

        System.out.println(Stock.center.use());

        System.out.println(Stock.cola.examine());

        System.out.println(Stock.cola.use());

        System.out.println(Stock.lemon.examine());

        System.out.println(Stock.lemon.use());

        VendingMachineImpl vendingMachine = new VendingMachineImpl(0, products);


        String[] productList = vendingMachine.getProducts();
        for (String productInfo : productList) {
            System.out.println(productInfo);
        }

        System.out.println("Available products:");
        for (Product p : products) {
            System.out.println(p.examine());
        }

        vendingMachine.addCurrency(50);
        System.out.println("Current balance: " + vendingMachine.getBalance());

        Product bought = vendingMachine.request(2);
        if (bought != null) {
            System.out.println("You bought: " + bought.getProductName());
            System.out.println("Using product: " + bought.use());
        }

        System.out.println("Remaining balance: " + vendingMachine.getBalance());

        System.out.println("Product Description:");
        System.out.println(vendingMachine.getDescription(1));

        int change = vendingMachine.endSession();
        System.out.println("Change returned: " + change + " SEK");
    }



}
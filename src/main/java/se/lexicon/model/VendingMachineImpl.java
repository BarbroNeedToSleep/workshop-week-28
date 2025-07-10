package se.lexicon.model;

public class VendingMachineImpl implements VendingMachine {

    Product[] products;
    int depositPool;

    private final int[] validDenominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};


    public VendingMachineImpl(int depositPool, Product[] products) {
        this.depositPool = depositPool;
        this.products = products;
    }

    @Override
    public void addCurrency(int amount) {

        if (isValidDenomination(amount)) {
            depositPool += amount;
        } else {
            System.out.println("Currency is invalid: " + amount + " SEK not accepted.");
        }

    }


    private boolean isValidDenomination(int amount) {
        for (int valid : validDenominations) {
            if (valid == amount) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                int roundedPrice = (int) Math.round(product.getPrice());

                if (depositPool >= roundedPrice) {
                    depositPool -= roundedPrice;
                    return product;
                } else {
                    System.out.println("Not enough currency for pushes: " + product.getProductName());
                    return null;
                }
            }

        }
        System.out.println("Product with ID " + id + "not found.");
        return null;
    }

    @Override
    public int getBalance() {
        return depositPool;
    }



    @Override
    public int endSession() {
        int change = depositPool;
        depositPool = 0;
        return change;
    }


    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product.examine();
            }
        }
        return "Product not found.";
    }


    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            Product p = products[i];
            productDescriptions[i] = "ID: " + p.getId() + ", Name: " + p.getProductName() + ", Price: " + p.getPrice();
        }
        return productDescriptions;
    }
}

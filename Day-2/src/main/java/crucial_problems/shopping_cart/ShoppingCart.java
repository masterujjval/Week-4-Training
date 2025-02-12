package crucial_problems.shopping_cart;

import java.util.*;

public class ShoppingCart {

    // HashMap to store the product and their prices for quick lookups
    private Map<String, Double> priceMap;

    // LinkedHashMap to store products while maintaining the order of insertion
    private LinkedHashMap<String, Integer> cart;


    private TreeMap<Double, List<String>> sortedByPriceMap;

    public ShoppingCart() {
        priceMap = new HashMap<>();
        cart = new LinkedHashMap<>();
        sortedByPriceMap = new TreeMap<>();
    }

    // Method to add a product to the shopping cart
    public void addProduct(String product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
        updateSortedByPrice(product);
    }


    public void setPrice(String product, double price) {
        priceMap.put(product, price);
    }

    // Helper method to update the TreeMap with the price of the product
    private void updateSortedByPrice(String product) {
        double price = priceMap.getOrDefault(product, 0.0);
        sortedByPriceMap.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
    }

    // Method to display items in the order of insertion (LinkedHashMap)
    public void displayCartInInsertionOrder() {
        System.out.println("Items in Cart (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> Quantity: " + entry.getValue());
        }
    }

    // Method to display items sorted by their price (TreeMap)
    public void displayCartSortedByPrice() {
        System.out.println("Items Sorted by Price:");
        for (Map.Entry<Double, List<String>> entry : sortedByPriceMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " -> Price: " + entry.getKey());
            }
        }
    }

    // Method to calculate the total price of items in the cart
    public double calculateTotal() {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            double price = priceMap.getOrDefault(entry.getKey(), 0.0);
            total += price * entry.getValue();
        }
        return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Set product prices
        cart.setPrice("Laptop", 800.00);
        cart.setPrice("Smartphone", 500.00);
        cart.setPrice("Headphones", 100.00);
        cart.setPrice("Keyboard", 50.00);

        // Add products to the cart
        cart.addProduct("Laptop", 1);
        cart.addProduct("Smartphone", 2);
        cart.addProduct("Headphones", 1);
        cart.addProduct("Keyboard", 3);

        // Display the items in the cart in the order of insertion
        cart.displayCartInInsertionOrder();

        // Display the items sorted by price
        cart.displayCartSortedByPrice();

        // Display the total cost of items in the cart
        System.out.println("Total Cost: $" + cart.calculateTotal());
    }
}

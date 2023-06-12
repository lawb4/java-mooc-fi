package Fundamentals_II.Part_9.Interfaces.OnlineShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;

    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStocks.put(product, stock);
    }

    public int price(String product) {
        return productPrices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return productStocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        // The order of the TWO conditions below is ESSENTIAL! Don't make it al reves!
        if (productStocks.containsKey(product) && productStocks.get(product) > 0) {
            productStocks.put(product, productStocks.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        return productStocks.keySet();
    }
}

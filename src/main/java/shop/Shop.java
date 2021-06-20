package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addStock(ShopItem item) {
        stock.add(item);
    }

    public void removeStock(ShopItem item) {
        stock.remove(item);
    }

    public double calculateStockProfit() {
        int total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}

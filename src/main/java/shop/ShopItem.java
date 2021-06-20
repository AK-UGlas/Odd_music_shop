package shop;

import behaviours.ISell;

public abstract class ShopItem implements ISell {

    private double buyingPrice;
    private double sellingPrice;

    public ShopItem(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}

package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import shop.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay, ISell {
    private String material;
    private String color;
    private InstrumentType type;

    public Instrument(double buyingPrice, double sellingPrice, InstrumentType type, String material, String color) {
        super(buyingPrice, sellingPrice);
        this.type = type;
        this.color = color;
        this.material = material;
    }

}

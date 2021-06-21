package instruments;

public class Trumpet extends Instrument {

    public Trumpet(double buyingPrice, double sellingPrice, InstrumentType type, String material, String color, String brand) {
        super(buyingPrice, sellingPrice, type, material, color, brand);
    }

    @Override
    public String playSound() {
        return "a Miles Davis-style cool groove";
    }
}

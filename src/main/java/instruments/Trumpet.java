package instruments;

public class Trumpet extends Instrument {

    public Trumpet(double buyingPrice, double sellingPrice, InstrumentType type, String material, String color) {
        super(buyingPrice, sellingPrice, type, material, color);
    }

    @Override
    public String playSound() {
        return "a Miles Davis-style cool groove";
    }
}

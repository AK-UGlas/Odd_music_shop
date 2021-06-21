package instruments;

public class Banjo extends Instrument {

    private final int numStrings = 4;

    public Banjo(double buyingPrice, double sellingPrice, InstrumentType type, String material, String color, String brand) {
        super(buyingPrice, sellingPrice, type, material, color, brand);
    }

    @Override
    public String playSound() {
        return "Playing the theme tune to Deliverance (aka Foggy Mountain Breakdown)";
    }
}

package instruments;

public class Guitar extends Instrument {

    private int numStrings;

    public Guitar(double buyingPrice, double sellingPrice, InstrumentType type, String material, String color, String brand,
                  int numStrings) {
        super(buyingPrice, sellingPrice, type, material, color, brand);
        this.numStrings = numStrings;
    }

    @Override
    public String playSound() {
        return "Voodoo Child, by Jimmy Hendrix";
    }
}

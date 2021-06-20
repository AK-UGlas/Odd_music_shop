package instruments;

public class SnareDrum extends Instrument {

    public SnareDrum(double buyingPrice, double sellingPrice, InstrumentType type, String material, String color) {
        super(buyingPrice, sellingPrice, type, material, color);
    }

    @Override
    public String playSound() {
        return "some cool marching band drumming sounds";
    }
}

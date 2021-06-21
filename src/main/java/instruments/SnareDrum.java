package instruments;

public class SnareDrum extends Instrument {

    public SnareDrum(double buyingPrice, double sellingPrice, InstrumentType type, String material, String color, String brand) {
        super(buyingPrice, sellingPrice, type, material, color, brand);
    }

    @Override
    public String playSound() {
        return "some cool marching band drumming sounds";
    }
}

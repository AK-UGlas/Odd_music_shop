import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop musicShop;
    private Guitar guitar;
    private Trumpet trumpet;

    @Before
    public void before() {
        musicShop = new Shop();
        guitar = new Guitar(400, 750, InstrumentType.STRINGED, "wood?", "Cherry Sunburst",
                "Les Paul", 6);
        trumpet = new Trumpet(650, 750, InstrumentType.BRASS, "brass, I guess..", "Whatever color brass is",
                "Famous Trumpet Co.");
    }

    @Test
    public void canCalculateTotalStockProfit() {
        musicShop.addStock(guitar);
        musicShop.addStock(trumpet);
        assertEquals(450.00, musicShop.calculateStockProfit(), 0.0);
    }
}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CheckOutTest {
    
    @BeforeEach
    public void setUp(){
        CheckOut.productNames.clear();
        CheckOut.quantities.clear();
        CheckOut.prices.clear();
        CheckOut.totals.clear();
    }
    
    @Test
    public void testToAddItem(){
        CheckOut.addItem("parfait", 2, 2100);
        
        assertEquals("parfait", CheckOut.productNames.get(0));
        assertEquals(2, CheckOut.quantities.get(0));
        assertEquals(2100, CheckOut.prices.get(0));
    }
    
    @Test
    public void testToCalculateDiscount(){
        CheckOut.totals.add(2100.00);
        CheckOut.totals.add(550.00);
        double disc = 8.0;
        double expected = 212.00;
        double actual = CheckOut.discountAmount(disc);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToGetTotal(){
        CheckOut.addItem("parfait", 2, 2100);
        int expectedTotal = 4200;
        assertEquals(expectedTotal, CheckOut.totals.get(0));    
    }
    
    @Test
    public void testToGetSubTotal(){
        CheckOut.totals.add(2000.00);
        CheckOut.totals.add(4000.00);
        assertEquals(6000.00, CheckOut.getSubTotal());
    }
    
    @Test
    public void testToCalculateVAT(){
        CheckOut.totals.add(2000.00);
        CheckOut.totals.add(4000.00);
        double expectedVAT = 1050;
        assertEquals(expectedVAT, CheckOut.getVAT());
    }
    
    @Test
    public void testToCalculateGrandTotal(){
        CheckOut.totals.add(4200.00);
        CheckOut.totals.add(1100.00);
        double discount = 8;
        double expectedGrandTotal = 5803.50;
        assertEquals(expectedGrandTotal, CheckOut.getGrandTotal(discount));
    }
    
    @Test
    public void testToCalculateCustomerBalance(){
        CheckOut.totals.add(4200.00);
        CheckOut.totals.add(1100.00);
        double amtPaid = 6000;
        double disc = 8;
        double expectedBalance = 196.50;
        assertEquals(expectedBalance, CheckOut.getBalance(amtPaid, disc));
    }
    
    
    
    
    
    
    
    
    
    
}

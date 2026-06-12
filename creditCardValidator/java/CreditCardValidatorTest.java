import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest {
    
    @Test
    public void tesToCheckCreditCardTypeIsMasterCard(){
        long num = 5399831619690403L;
        String expected = "Master Card";
        assertEquals(expected, CreditCardValidator.creditCardType(num));
    }
    
    @Test
    public void tesToCheckCreditCardTypeIsVisaCard(){
        long num = 4399831619690403L;
        String expected = "Visa Card";
        assertEquals(expected, CreditCardValidator.creditCardType(num));
    }
    
    @Test
    public void tesToCheckCreditCardTypeIsDiscoveryCard(){
        long num = 6399831619690403L;
        String expected = "Discovery Card";
        assertEquals(expected, CreditCardValidator.creditCardType(num));
    }
    
    @Test
    public void tesToCheckCreditCardTypeIsAmericanExpressCard(){
        long num = 3799831619690403L;
        String expected = "American Express Card";
        assertEquals(expected, CreditCardValidator.creditCardType(num));
    }    
    
    @Test
    public void tesToCheckCreditCardTypeIsInvalid(){
        long num = 7659831619690403L;
        String expected = "Invalid Card";
        assertEquals(expected, CreditCardValidator.creditCardType(num));
    }
    
    @Test
    public void tesToCheckCreditCardTypeIsInvalidIfLessThan13Digit(){
        long num = 831619690403L;
        String expected = "Invalid Card";
        assertEquals(expected, CreditCardValidator.creditCardType(num));
    }
    
    @Test
    public void testToReturnCardNumber(){
        long num = 3799831619690403L;
        long expected = 3799831619690403L;
        assertEquals(expected, CreditCardValidator.cardNumber(num));
    }
    
    @Test
    public void testToReturnCardLength(){
        long num = 3799831619690403L;
        int expected = 16;
        assertEquals(expected, CreditCardValidator.cardLength(num));
    }
    
    @Test
    public void testToCheckCardValidStatus(){
        long num = 5399831619690403L;
        String expected = "Valid";
        assertEquals(expected, CreditCardValidator.cardStatus(num));
    }
    
    
    
    
    
    
    
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTwoTest {

    @Test
    public void testToCheckIfArrayIsPallindrome(){        
        int[] arr = {45, 0, 8, 0, 45};        
        boolean actual = TaskTwo.isArrayPallindrome(arr);
        assertTrue(actual);
    }
}

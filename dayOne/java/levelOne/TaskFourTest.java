import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFourTest {
    
    @Test
    public void testToReturnNotPerfectSquare(){
        int[] arr = {4, 7, 9, 10, 49, 18};
        int[] expected = {4, -1, 9, -1, 49, -1};
        int[] actual = TaskFour.nonPerfectSquare(arr);
        assertArrayEquals(expected, actual);
    }
}


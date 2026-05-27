import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskThreeTest {
    @Test
    public void testToReturnOnlyPerfectSquareOfOriginalArray(){
        int[] arr = {4, 7, 9, 10, 16, 18};
        int[] expected = {4, 9, 16};
        int[] actual = TaskThree.perfectSquare(arr);
        assertArrayEquals(expected, actual);
    }
}

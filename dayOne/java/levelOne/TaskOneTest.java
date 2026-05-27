import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest {
    @Test
    public void testToReturnNew2DArray(){
        int[] arr = {45, 60, 3, 10, 9, 22};
        int[][] expected = {{45, 3, 9}, {60, 10, 22}};
        int[][] actual = TaskOne.evenOddArray(arr);
        assertArrayEquals(expected, actual);
    }
}

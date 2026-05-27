import java.util.Arrays;

public class TaskTwo {
    
    public static boolean isArrayPallindrome(int[] arr){
        
        int[] copy = arr;
        int[] reverse = new int[arr.length];
        int count = 0;
        
        for (int index = arr.length - 1; index >= 0; index--){
            reverse[count++] = arr[index];
        }
        
        return Arrays.equals(reverse, copy);
    
    }
}

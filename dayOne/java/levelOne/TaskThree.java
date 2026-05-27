import java.util.Arrays;

public class TaskThree {
    
    public static int[] perfectSquare(int[] arr){
        
        int[] result = new int[arr.length];
        int count = 0;
        for (int index = 0; index < arr.length; index++){
            
            int squareRoot = (int) Math.sqrt(arr[index]);
            
            if (squareRoot * squareRoot == arr[index]){
                result[count++] = arr[index];
            }            
            
        }   
        
        return Arrays.copyOf(result, count);
    }
}

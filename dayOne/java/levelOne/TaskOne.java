public class TaskOne {
    
    public static int[][] evenOddArray(int[] arr){
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int index = 0; index < arr.length; index++){
            if (arr[index] % 2 == 0) evenCount++;
            else oddCount++;
        }
        
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        
        int e = 0;
        int o = 0;
        
        for (int index = 0; index < arr.length; index++){
            if (arr[index] % 2 == 0) even[e++] = arr[index];
            else odd[o++] = arr[index];
        }
        
        int[][] result = {odd, even};
           
        return result;
    }
    
}

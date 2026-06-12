public class CreditCardValidator {
    
    public static String creditCardType(long number){
        String convert = "" + number;
        String first = "" + convert.charAt(0);
        String firstSecond = convert.substring(0, 2);

        if (first.equals("4")) return "Visa Card";
        else if (convert.length() < 13 || convert.length() > 16) return "Invalid Card";
        else if (first.equals("5")) return "Master Card";
        else if (first.equals("6")) return "Discovery Card";  
        else if (firstSecond.equals("37")) return "American Express Card"; 
        else return "Invalid Card";
    }
    
    public static long cardNumber(long number){
        return number;
    }
    
    public static int cardLength(long number){
        String result = "" + number;
        return result.length();
    }
    
    public static String cardStatus(int number){
        String convert = "" + number;
        int count = convert.length();
        int[] store = new int[count];
        
        for (int index = 0; index < count; index++){
            int num = (int) convert.charAt(index);
            store[index] = num;
        }
        
        String[] evenIndex = new String[convert.length() + 1 / 2];
        for (int index = 0; index < count; index++){
            if (store[index] % 2 == 0){
                evenIndex[index] = "" + store[index] * 2;
            }
        }
        
        for (int index = 0; index < evenIndex.length; index++){
            if (evenIndex[index].length() == 2){
                int sumGreaterIndex = (Integer.parseInt(evenIndex[index]))/ 10 + (Integer.parseInt(evenIndex[index])) % 10;
                Integer.parseInt(evenIndex[index]) = sumGreaterIndex;
            }
        }
        
        int sumDigit = 0;
        for (int index = 0; index < evenIndex.length; index++){
            sumDigit += evenIndex[index];
        }
        
        int sumOddDigit = 0;
        for (int index = 0; index < store.length; index++){
            if (store[index] % 2 != 0){
                sumOddDigit += store[index]; 
            }
        }
        
        int sumStepResult = sumDigit + sumOddDigit;
        
        if(sumStepResult % 10 == 0){
            return "Valid";
        }else return "Invalid";
        
        
        
    }
    
    
    
    
    
}

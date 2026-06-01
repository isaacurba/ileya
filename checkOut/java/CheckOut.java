import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOut {

    public static void main(String... vivien){
        Scanner input = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.now(); 
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String newDateTime = dateTime.format(formatter);
         
         
         
        
        System.out.println("What is the customer's Name");
        String cusName = input.nextLine();
        System.out.println();
        
        boolean addMore = true;
        
        while(addMore){
        
            System.out.println("What did the user buy?");
            String cusItem = input.nextLine();
            System.out.println();
            
            System.out.println("How many pieces?");
            int piece = input.nextInt();
            System.out.println();
            
            System.out.println("How much per unit?");
            int pricePerUnit = input.nextInt();
            System.out.println();
            
            input.nextLine(); 

            addItem(cusItem, piece, pricePerUnit);
            
            System.out.println("Add more items?");
            String continueMessage = input.nextLine();
            
            if (continueMessage.equalsIgnoreCase("no")){
                addMore =  false;
            } 
        }      
        
        System.out.println();
        
        System.out.println("What is your name?");
        String cashName = input.nextLine();
        
        System.out.println();
        
        System.out.println("How much discount will he get?");
        double discount = input.nextDouble();

        double subTotal = getSubTotal();
        double vat = getVAT();
        double discountAmt = discountAmount(discount);
        double grandTotal = getGrandTotal(discount);
        
        System.out.println();
        
        System.out.print("""
        SEMICOLON STORES
        MAIN BRANCH
        LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
        TEL: 03293828343
        DATE : %s
        Cashier: %s
        Customer Name: %s
        """.formatted(newDateTime, cashName, cusName));
       System.out.println(); System.out.println("===========================================================");
        System.out.printf("%15s %10s %10s %10s%n",
        "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("------------------------------------------------------------");
        
        for (int index = 0; index < productNames.size(); index++) {
        
            System.out.printf("%13s %10d %10.2f %10.2f%n",
                productNames.get(index),
                quantities.get(index),
                prices.get(index),
                totals.get(index));
        }
        
        System.out.println();
        System.out.println();  System.out.println("------------------------------------------------------------");
        
        System.out.printf("%23s: %20.2f%n", "Sub Total", subTotal);
        System.out.printf("%23s: %20.2f%n", "Discount", discountAmt);
        System.out.printf("%23s: %20.2f%n", "VAT @ 17.50%", vat);
        System.out.println("===========================================================");
        
        System.out.printf("%23s: %20.2f%n", "Bill Total", subTotal);
         System.out.println("===========================================================");

        System.out.printf("   THIS IS NOT A RECEIPT KINDLY PAY %.2f%n", subTotal);
        
        System.out.println("===========================================================");
   
        System.out.println();
        System.out.println("How much did the customer give to you?");
        double cusAmt = input.nextDouble();
        
        double balance = getBalance(cusAmt, discount); 
        
        System.out.println();
        System.out.println();
        
        System.out.print("""
        SEMICOLON STORES
        MAIN BRANCH
        LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
        TEL: 03293828343
        DATE : %s
        Cashier: %s
        Customer Name: %s
        """.formatted(newDateTime, cashName, cusName));
        System.out.println(); 
        System.out.println("===========================================================");
        System.out.printf("%15s %10s %10s %10s%n",
        "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("------------------------------------------------------------");
        
        for (int index = 0; index < productNames.size(); index++) {
        
            System.out.printf("%13s %10d %10.2f %10.2f%n",
                productNames.get(index),
                quantities.get(index),
                prices.get(index),
                totals.get(index));
        }
        
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------------");
        
        System.out.printf("%23s: %20.2f%n", "Sub Total", subTotal);
        System.out.printf("%23s: %20.2f%n", "Discount", discountAmt);
        System.out.printf("%23s: %20.2f%n", "VAT @ 17.50%", vat);
        System.out.println("===========================================================");
        
        System.out.printf("%23s: %20.2f%n", "Bill Total", subTotal);
        System.out.printf("%23s: %20.2f%n", "Amount Paid", cusAmt);
        System.out.printf("%23s: %20.2f%n", "Balance", balance);
         System.out.println("===========================================================");

        System.out.println("          THANK YOU FOR YOUR PATRONAGE");             
    System.out.println("===========================================================");
   
   
   
   
   
   
   
    }
        
    public static ArrayList<String> productNames = new ArrayList<>();
    public static ArrayList<Integer> quantities = new ArrayList<>();
    public static ArrayList<Double> prices = new ArrayList<>();
    public static ArrayList<Double> totals = new ArrayList<>();
    
    public static void addItem(String productName, int quantity, double price){
        productNames.add(productName);
        quantities.add(quantity);
        prices.add(price);
        
        double total = quantity * price;
        totals.add(total);
    }
    
    public static double discountAmount(double discount){
        return (getSubTotal() * discount) / 100;
    }
    
    public static double getSubTotal(){
        double subtotal = 0;
        for (int index = 0; index < totals.size(); index++){
            subtotal += totals.get(index);
        }
        return subtotal;
    }
    
    public static double getVAT(){
        double vat = 17.50;
        double vatAmount = 0;
        for (int index = 0; index < totals.size(); index++){
            vatAmount += totals.get(index); 
        }
        return (vatAmount * vat) / 100;
    }
    
    public static double getGrandTotal(double discount){
        return getSubTotal() - discountAmount(discount) + getVAT();
    }
    
    public static double getBalance(double amtPaid, double discount){
        return amtPaid - getGrandTotal(discount);
    }
    
 
}

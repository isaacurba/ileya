import java.util.ArrayList;
import java.util.Scanner;

public class BookSuggestionSystem {
    
    public static ArrayList<String> books = new ArrayList<>();
    
    public static String addBook(String title){
        String lowerTitle = title.toLowerCase();
        
        if (books.contains(lowerTitle)){
            return "book already exist";
        }
        books.add(lowerTitle);
        
        return "book added successfully";
    }
    

    public static String removeBook(String title){
        String lowerTitle = title.toLowerCase();
        
        if (books.contains(lowerTitle)){
            books.remove(lowerTitle);
            return "book removed successfully";
        }
        
        return "books does not exist";
    }
    
    
    public static String updateBook(String title, String update){
        String message = "book does not exist";
        
        String lowerTitle = title.toLowerCase();
        String lowerTitleUpdate =  update.toLowerCase();
        
        for (int index = 0; index < books.size(); index++){
            if (books.get(index).equals(lowerTitle)){
                books.set(index, lowerTitleUpdate);
                message = "book updated successfully";
            }
        }
        
        return message;
    }
    
    public record BookSuggestion(String title, int page){}
    
    public static BookSuggestion getSuggestion(){
        if (books.isEmpty()) {
            return new BookSuggestion("No books available. Please add a book first!", 0);
        }
    
        int random = (int) Math.floor(Math.random() * books.size());
        String randomBook = books.get(random); 
        int page = random + 1;
        
        return new BookSuggestion(randomBook, page);  
    }
    
    public static String allBooks() {
    
        StringBuilder result = new StringBuilder();
        
        for (int index = 0; index < books.size(); index++) {
        
            result.append((index + 1) + ". " + books.get(index) + "\n");
 
        }
        return result.toString();
    }
    
    
    

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        boolean isActive = true;
        
        while (isActive){
            System.out.println("Welcome to Book suggestion system");
            System.out.println("---------------------------------");
            System.out.println("""
                1. Get Suggestions
                2. Add Book
                3. Remove Book
                4. Update book
                5. Show all books 
                6. exit
            """);
            
            System.out.print("Enter operation: ");
            int options = input.nextInt();
            input.nextLine();
            
            switch(options){
                case 1:
                    System.out.println();
                    System.out.println("Book for the day:");
                    
                    BookSuggestion suggestion = getSuggestion();
                    boolean inSuggestion = true;
                    
                    while (inSuggestion){
                        System.out.print("\t Book title: ");
                        System.out.println(suggestion.title());
                        System.out.print("\t Page: ");
                        System.out.println(suggestion.page());
                        System.out.println();
                        
                        System.out.print("Would you like to get another suggestion (yes or no): ");
                        String anotherSuggestion = input.nextLine();
                        if(anotherSuggestion.equalsIgnoreCase("yes"))continue;
                        else break;
                    }
                    break;
                    
                case 2:
                    System.out.println();
                    System.out.print("\t Enter book title: ");
                    String bookTitle = input.nextLine();
                    System.out.println("\t " + addBook(bookTitle));
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println();
                    System.out.print("\t Enter book title to remove: ");
                    String removeTitle = input.nextLine();
                    System.out.println("\t " + removeBook(removeTitle));
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println();
                    System.out.print("\t Enter old title: ");
                    String oldTitle = input.nextLine();
                    System.out.print("\t Enter new title: ");
                    String newTitle = input.nextLine();
                    System.out.println("\t " + updateBook(oldTitle, newTitle));
                    System.out.println();
                    break;
                
                case 5:
                    System.out.println();
                    System.out.println("\t All books");
                    System.out.println("\t " + allBooks());
                    System.out.println();
                    break;
                    
                case 6:
                    isActive = false;
                    System.out.println("--------");                    
                    System.out.println("GOODBYE");
                    System.out.println("--------");
                    break;
                    
                default:
                    System.out.println("Enter a valid operation from (1 - 5) \n");
                    
            }

        }
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    


}



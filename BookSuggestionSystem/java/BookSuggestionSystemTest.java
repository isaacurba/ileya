import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookSuggestionSystemTest {
    
    @Test
    public void testToAddBookToCollection(){
        String book = "adam and eve";
        String expected = "book added successfully";
        String actual = BookSuggestionSystem.addBook(book);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToNotAddBookToCollectionIfBookAlreadyExist(){
        String book = "adam and eve";
        String expected = "book already exist";
        
        BookSuggestionSystem.books.add(book.toLowerCase());
        
        String actual = BookSuggestionSystem.addBook(book);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToRemoveBookFromCollection(){
        String book = "Adam and eve";
        String expected = "book removed successfully";
        
        BookSuggestionSystem.books.add(book.toLowerCase());        
        
        String actual = BookSuggestionSystem.removeBook(book);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNotToRemoveAnythingIfBookDoesNotExist(){
        String book = "romeo and juliet";
        String expected = "books does not exist";
        String actual = BookSuggestionSystem.removeBook(book);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToUpdateBookInCollectionIfExist(){
        String book = "adam and eve";
        String update = "kane and abel";
        
        BookSuggestionSystem.books.add(book.toLowerCase());
        
        String expected = "book updated successfully";
        String actual = BookSuggestionSystem.updateBook(book, update);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToNotUpdateBookInCollectionIfDoesNotExist(){
        String book = "adam and eve";
        String update = "kane and abel";
        String expected = "book does not exist";
        String actual = BookSuggestionSystem.updateBook(book, update);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToGetSuggestionOfAnyBookFromTheLibrary(){
        String expected = "the apprentice";

        BookSuggestionSystem.books.add(expected);
        
        BookSuggestionSystem.BookSuggestion page = BookSuggestionSystem.getSuggestion();
        
        assertEquals(expected, page.title());           
        assertEquals(1, page.page());   
    }
    
    @Test
    public void testToShowNoSuggestionIfNoBookIsAdded(){
        BookSuggestionSystem.books.clear();
        String expected = "No books available. Please add a book first!";

        BookSuggestionSystem.BookSuggestion page = BookSuggestionSystem.getSuggestion();
        
        assertEquals(expected, page.title());           
        assertTrue(page.page() >= 0);
    }
    
    @Test
    public void testToShowAllTheBooksInTheLibrary(){
        String book = "grey anatomy";
        
        BookSuggestionSystem.books.clear();
        BookSuggestionSystem.books.add(book.toLowerCase());
        String expected = "1. grey anatomy";
        String actual = BookSuggestionSystem.allBooks();
        assertEquals(expected, actual);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

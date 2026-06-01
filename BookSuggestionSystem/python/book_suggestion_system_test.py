from unittest import TestCase 
from book_suggestion_system import * 

class AddBookToLibrary(TestCase): 
    def setUp(self): 
        library.clear() 

    def test_that_book_is_adding_to_the_library(self): 
        title = "mercinearies" 
        self.assertEqual("book added successfully", add_book(title)) 

    def test_that_book_should_not_be_added_to_library_if_it_exists(self): 
        title = "attack on titans" 
        library.append(title) 
        self.assertEqual("book already exist", add_book(title)) 


class RemoveBookFromLibrary(TestCase): 
    def setUp(self): 
        library.clear()  

    def test_to_remove_book_from_the_library(self): 
        title = "the mummy" 
        library.append(title) 
        self.assertEqual("book removed successfully", remove_book(title)) 

    def test_not_to_remove_any_book_if_it_doesnt_exist(self): 
        title = "the simpsons" 
        self.assertEqual("book does not exist", remove_book(title)) 


class UpdateBookInLibrary(TestCase): 
    def setUp(self): 
        library.clear()  

    def test_to_update_a_book_from_the_library(self): 
        title = "ant man" 
        updated = "avengers" 
        library.append(title) 
        self.assertEqual("book updated successfully", update_book(title, updated)) 

    def test_not_to_update_book_in_library_if_it_does_not_exist(self): 
        title = "john wick" 
        update = "avatar" 
        self.assertEqual("book does not exist to be updated", update_book(title, update)) 


class ShowBookInLibrary(TestCase): 
    def setUp(self): 
        library.clear()  

    def test_to_show_all_books_in_the_library(self): 
        library.append("alice") 
        self.assertEqual("1. alice", all_books()) 

    def test_to_suggest_book(self): 
        title = "bingo story" 
        library.append(title) 
        name, page = suggest_book() 
        self.assertEqual(library[0], name) 
        self.assertTrue(page > 0) 

    def test_not_to_suggest_any_book_if_library_is_empty(self): 
        result = suggest_book() 
        expected = "No books available. Please add a book first!"
        
        if isinstance(result, tuple):
            name, page = result
            self.assertEqual(expected, name) 
            self.assertEqual(0, page)
        else:
            self.assertEqual(expected, result)




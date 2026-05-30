from book_suggestion_system import *

is_active = True
while is_active:
    print()
    print("Welcome to the Book Suggestion System")
    print("""
        1. Get Suggestions
        2. Add Book
        3. Remove Book
        4. Update Book
        5. Show books
    """)
    option = int(input("Enter operation: "))
    print()    

    match option:
        case 1:
            print("Book for the day:")
            in_book_suggestion = True
            while in_book_suggestion:
                name, page = suggest_book()
                print(f"\t{name}")
                print(f"\tpage: {page}")
                if page == 0: break
                another_suggestion = input("Would you like to get another suggestion? (yes/no)", end="")
                if another_suggestion == "yes": continue
                else: in_book_suggestion = False
                
                
        case 2:
            add_title = input("\tEnter the book title: ")
            print("\t", add_book(add_title))
            
        case 3: 
            remove_title = input("\tEnter book title to remove: ")     
            print("\t", remove_book(remove_title))
            
        case 4:
            old_title = input("\tEnter the old title: ")
            new_title = input("\tEnter the new title: ")
            print("\t", update_book(old_title, new_title))
            
        case 5:
            print("\tAll Books")
            print("\t", all_books())
            
        case _: print("Enter a valid option from (1-6)")
                
              
    
    
    

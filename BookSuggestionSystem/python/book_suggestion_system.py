import random

library = []

def add_book(title):
    lower_title = title.lower()
    if lower_title in library:
        return "book already exist"
    library.append(lower_title)
    return "book added successfully"
 
    
def remove_book(title):
    lower_title = title.lower()
    if lower_title not in library:
        return "book does not exist"
    library.remove(lower_title)
    return "book removed successfully"
 
    
def update_book(title, update):
    lower_title = title.lower()
    lower_update = update.lower()
    if lower_title in library:
        index = library.index(title)
        library[index] = lower_update
        return "book updated successfully"
    return "book does not exist to be updated"
 
    
def all_books():
    result = []
    if not library:
        return "no book available"
    for number, index in enumerate(library, start=1):
        each = f"{number}. {index}"
        result.append(each)
    return "\n".join(result)    
    

def suggest_book():
    if not library:
        return "No books available. Please add a book first!", 0
    random_book = random.choice(library) 
    page = random.randint(1, 101)
    return random_book, page
    
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

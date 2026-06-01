import math

def task_one(arr):
    even = []
    odd = []
    result = []
    for number in arr:
        if number % 2: even.append(number)
        else: odd.append(number)
    
    result = [even, odd]
    return result
    
        
def task_two(arr):
    reverse = arr[::-1]
    if arr == reverse:return True
    else: return False
    
    
def task_three(arr):
    result = []
    for num in arr:
        square_root = math.sqrt(num)
        if square_root * square_root == num:
            result.append(num)
    return result  
    

def task_four(arr):
    result = []
    for num in arr:
        root = math.isqrt(num)
        if root * root != num:
            result.append(-1)
        else:
            result.append(int(num)) 
    return result

   
     
            
            
            
            
            
            
            
            
            
            
            
            
            


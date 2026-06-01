from unittest import TestCase
from task_one import *

class TaskOneTest(TestCase):
    
    def test_to_store_even_and_odd_array_into_2d_array(self):
        arr = [45, 60, 3, 10, 9, 22]
        expected = [[45, 3, 9], [60, 10, 22]]
        self.assertEqual(expected, task_one(arr))
        
class TaskTwoTest(TestCase):
    
    def test_to_to_check_if_array_is_pallindrome(self):
        arr = [45, 0, 8, 0, 45]
        self.assertTrue(task_two(arr))
        
class TaskThreeTest(TestCase):
    def test_to_return_perfect_square_of_an_array(self):
        arr = [4, 7, 9, 10, 16, 18]
        expected = [4, 9, 16]
        self.assertEqual(expected, task_three(arr))
        
class TaskFourTest(TestCase):
    def test_to_return_non_perfect_as_minus_one_in_an_array(self):
        arr = [4, 7, 9, 10, 49, 6]
        expected = [4, -1, 9, -1, 49 , -1]
        self.assertEqual(expected, task_four(arr))
        

# in python use the snake_case
# fro all the variable, module, fuction, method, and package names use the snake_case
# eg
my_name = "Vishal"
my_age = 23
def my_function():
    print("This is my function")
    a = "This is a variable inside the function"
    return a

a = my_function()
print(a)

# Define constant in python we use the ALL CAPITAL LETTERS VARIABLES
DOBM = 10
print(DOBM)

DOBM = 232
print(DOBM) # still we can update them if we want to but it is not recommended to do so as it can lead to confusion and bugs in the code.
 
# to define the variable with immutable use have to use the final module in the typing package
from typing import Final 

DOBD:  Final= 10

print(DOBD)
DOBD = 12
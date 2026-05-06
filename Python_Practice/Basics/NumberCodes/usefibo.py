import Fibonacci
print(Fibonacci.fibonacciRec(10))
print(Fibonacci.fibonacciIter(10))


self = 42342
print(self)

class A:
    def __init__(self, name):
        self.name = name

    def __str__(self):
        return f"A object with name: {self.name}"
    
    def __repr__(self):
        return f"A object with name: {self.name}"
    def ok():
        print("ok")
a = A("John")
print(a.name)  # Output: John


A.ok()  # Output: ok
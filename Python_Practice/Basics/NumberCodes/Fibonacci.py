def fibonacciRec(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacciRec(n - 1) + fibonacciRec(n - 2)  

def fibonacciIter(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        a, b = 0, 1
        print("1 ",a)
        for _ in range(2, n + 1):
            print(_, "",b)
            a, b = b, a + b
        return b
    
print(fibonacciRec(10))  # Output: 55
print(fibonacciIter(10))  # Output: 55
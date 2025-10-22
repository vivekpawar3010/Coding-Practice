#include<bits/stdc++.h>
using namespace std;
void swaptemp(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}
void swapwithouttemp(int &a, int &b) {
    a = a + b;
    b = a - b;
    a = a - b;
}
void swapbybool(int &a, int &b) {
    a = a ^ b;   
    b = a ^ b;
    a = a ^ b;
}

// ^ - xor operator
// ~ - not operator
// & - and operator

int main() {
    int x, y;
    cout << "Enter two integers: ";
    cin >> x >> y;
    cout << "Enter the choise of swapping method (\n1 for using temp variable, \n2 for without temp variable, \n 3 by using bool opreation): ";
    int choice;
    cin >> choice;
    
    cout << "Before swap: x = " << x << ", y = " << y << endl;
    switch (choice)
    {
    case 1:
        swaptemp(x, y);
        break;
    case 2:
        swapwithouttemp(x, y);
        break;
    case 3:
        swapbybool(x, y);
        break;
    default:
        cout << "Invalid choice!" << endl;
        break;
    }
    cout << "After swap: x = " << x << ", y = " << y << endl;
    return 0;
}
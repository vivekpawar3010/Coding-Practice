#include <bits\stdc++.h>
#include "all_patterns.h"
using namespace std;
int main() {
    
    cout << "The Created fuctions are as follow" << endl;
    cout << "1. simplesqure(int n)" << endl;
    cout << "2. lefttriangle(int n)" << endl;
    cout << "3. righttri(int n)" << endl;
    cout << "4. isoscalus(int n)" << endl;
    int choice;
    cout << "Enter your choice (1-4): ";
    cin >> choice;
    int n;
    cout << "Enter the number of rows: ";
    cin >> n;
    switch (choice) {
        case 1:
            simplesqure(n);
            break;
        case 2:
            lefttriangle(n);
            break;
        case 3:
            righttri(n);
            break;
        case 4:
            isoscalus(n);
            break;
        default:
            cout << "Invalid choice!" << endl;
            cout << "We still have only 4 functions" << endl;
            cout << "Please choose from 1 to 4" << endl;
            cout << "On other we are still working" << endl;
            break;
    }
    return 0;
}
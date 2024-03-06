#include <iostream>
using namespace std;

int main()
{
    int a, b;
    char function;

    cout << "Enter 2 numbers: ";
    cin >> a >> b;

    cout << "Choose the function: ";
    cin >> function;

    switch (function)
    {
    case '+':
        cout << a + b << endl;
        break;
    case '-':
        cout << a - b << endl;
        break;
    case '*':
        cout << a * b << endl;
        break;
    case '/':
        cout << a / b << endl;
        break;
    default:
        cout << "Wrong function input";
        break;
    }
}
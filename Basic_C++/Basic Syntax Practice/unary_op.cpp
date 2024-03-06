#include <iostream>
using namespace std;

int main()
{
    int a = 10, b;
    cout << "Preincrementer (++a): ";
    b = ++a;
    cout << a << " || " << b << endl;

    cout << "Postincrementer (a++): ";
    b = a++;
    cout << a << " || " << b << endl;
}
#include <iostream>
using namespace std;

int main()
{
    int a, b, c;
    cout << "Enter values of 3 numbers: " << endl;
    cin >> a >> b >> c;

    if (a > b)
    {
        if (a > c)
        {
            cout << "A is the greatest" << endl;
        }
    }
    else if (b > c)
    {
        cout << "B is the greatest" << endl;
    }
    else
    {
        cout << "C is the greatest." << endl;
    }
}
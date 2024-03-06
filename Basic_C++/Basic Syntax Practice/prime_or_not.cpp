// Aim: Is to find if a given number is prime or not.

#include <iostream>
using namespace std;

int main()
{
    int n, i;
    cout << "Enter a number" << endl;
    cin >> n;

    for (i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            cout << "Not Prime";
            break;
        }
    }

    if (i == n)
    {
        cout << "Prime";
    }
}
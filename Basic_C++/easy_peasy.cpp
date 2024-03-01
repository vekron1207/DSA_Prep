// AND and OR

#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if (n % 2 == 0 && n % 3 == 0)
    {
        cout << "Divisible by 2 and 3" << endl;
    }
    else if (n % 2 == 0)
    {
        cout << "Divisble by 2";
    }
    else if (n % 3 == 0)
    {
        cout << "Divisble by 3";
    }
    else
    {
        cout << "Divisble by non";
    }
    return 0;
}
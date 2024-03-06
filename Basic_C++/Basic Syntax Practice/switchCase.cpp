#include <iostream>
using namespace std;

int main()
{
    char button;
    cout << "Enter input: ";
    cin >> button;

    switch (button)
    {
    case 'a':
        cout << "hello";
        break;
    case 'b':
        cout << "World";
    default:
        cout << "Wrong option Selected!!";
        break;
    }

    return 0;
}
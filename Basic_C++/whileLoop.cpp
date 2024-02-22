#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter some number: ";
    cin >> n;

    while (n > 0)
    {
        cout << n << endl;
        cin >> n;
    }

    return 0;
}
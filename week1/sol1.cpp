#include <iostream>
using namespace std;

int main()
{
    int num[5];
    cout << "Enter 5 numbers: " << endl;

    for (int i = 0; i < 5; i++)
    {
        cin >> num[i];
    }
    cout << "The number are: ";

    for (int n = 0; n < 5; ++n)
    {
        cout << num[n] << " ";
    }
    return 0;
}

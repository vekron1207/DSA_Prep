#include <iostream>
using namespace std;

int main()
{
    int n, sum = 0;
    cin >> n;

    for (int count = 1; count <= n; count++)
    {
        sum = sum + count;
    }
    cout << "Sum is: " << sum << endl;
}
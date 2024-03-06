// Aim: To print the all the prime numbers in a given range.
// Took help, needs practice

#include <iostream>
using namespace std;

int main()
{
    int n, m, i, num;
    cout << "Enter 2 numbers: " << endl;
    cin >> n >> m;
    for (num = n; num <= m; num++)
    {
        for (i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                break;
            }
        }
        if (i == num)
        {
            cout << num << endl;
        }
    }
}
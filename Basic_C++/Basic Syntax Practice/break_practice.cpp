// AIM: Print the number from 1 to n; numbers that are divisble by 3 shoild be skipped.
// Used ChatGPT to correct the logical error!!

#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Give me a number: " << endl;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        if (i % 3 == 0) // Error: Was comparing n instead of I here, -- "ChatGPT"
        {
            continue;
        }
        cout << i << endl;
    }
    return 0;
}
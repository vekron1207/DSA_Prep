#include <iostream>
#include <unordered_map>

using namespace std;

int main()
{
    // Disable sync with C I/O for performance improvement
    ios_base::sync_with_stdio(false);
    // Untie cin from cout for performance improvement
    cin.tie(nullptr);

    // Variable to store the number of songs
    long long num;
    cin >> num; // Reading the number of songs from standard input

    // Hash map to count the occurrences of each singer's ID
    unordered_map<long long, long long> singerCounts;
    // Variable to keep track of the maximum occurrence count
    long long maxCount = 0;
    // Variable to keep track of the number of singers with the maximum count
    long long favouriteSingersCount = 0;

    // Iterate over all songs in the playlist
    for (long long i = 0; i < num; ++i)
    {
        // Variable to store the singer ID for the current song
        long long singer;
        cin >> singer; // Read the singer ID from standard input

        // Increment the count for this singer and get the updated count
        long long currentCount = ++singerCounts[singer];

        // Check if the updated count is greater than the current max count
        if (currentCount > maxCount)
        {
            maxCount = currentCount;   // Update the max count to the new higher count
            favouriteSingersCount = 1; // Reset the favorite count since we found a new max
        }
        else if (currentCount == maxCount)
        {
            // If the updated count equals the max count, increment the number of max-count singers
            favouriteSingersCount++;
        }
    }

    // Output the number of singers with the maximum count to standard output
    cout << favouriteSingersCount << "\n";
    // Return 0 to signal successful completion of the program
    return 0;
}

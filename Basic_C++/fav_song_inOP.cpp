#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n;
    cout << "Enter the number of songs in the playlist: ";
    cin >> n;

    // Initialize a vector to count the occurrences of each singer ID
    vector<int> singerCount(n, 0);
    int maxSongs = 0;   // Maximum number of songs by a single singer
    int maxSingers = 0; // Number of singers with the maximum number of songs

    // Read the singer IDs and count their occurrences
    for (int i = 0; i < n; ++i)
    {
        int singerID;
        cout << "Enter singer ID for song " << i + 1 << ": ";
        cin >> singerID;

        // Check if the input singer ID is within the expected range
        if (singerID < 0 || singerID >= n)
        {
            cout << "Singer ID out of range. Please enter a value between 0 and " << n - 1 << endl;
            --i;      // Decrement i to repeat the input for this song
            continue; // Skip the rest of this iteration
        }

        // Increment the count for this singer ID
        singerCount[singerID]++;

        // Check if we have a new maximum
        if (singerCount[singerID] > maxSongs)
        {
            maxSongs = singerCount[singerID];
            maxSingers = 1; // Reset the number of max singers since we have a new max
        }
        else if (singerCount[singerID] == maxSongs)
        {
            maxSingers++; // Increment the number of max singers
        }
    }

    // Output the number of singers who have the most songs in the playlist
    cout << "Number of singers with the most songs in the playlist: " << maxSingers << endl;

    return 0;
}

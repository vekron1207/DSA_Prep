#include <iostream>
#include <vector>

using namespace std;

int main()
{
    // We're asking the user how many songs they have in their playlist
    int n;
    cout << "Enter the number of songs in the playlist: ";
    cin >> n;

    // We're setting up some containers to keep track of singers and their songs
    int maxSongs = 0;   // This will store the maximum number of songs by any one singer
    int maxSingers = 0; // This will store the number of singers with the most songs

    // This is like having labeled jars to put things in; we'll use it to count how many songs each singer has
    vector<int> singerCount;

    // Now we're going through each song to find out who sings it
    for (int i = 0; i < n; ++i)
    {
        // We're asking the user who sings the current song
        int singerID;
        cout << "Enter singer ID for song " << i + 1 << ": ";
        cin >> singerID;

        // We're making sure we have enough jars for all our singers
        singerCount.resize(max(singerCount.size(), static_cast<size_t>(singerID) + 1), 0);

        // We're putting a song in the jar labeled with the singer's ID
        singerCount[singerID]++;

        // Now we're checking if this singer has more songs than anyone else
        if (singerCount[singerID] > maxSongs)
        {
            // If they do, we update our record of the most songs and reset the count of singers with that many songs
            maxSongs = singerCount[singerID];
            maxSingers = 1;
        }
        // If this singer has the same number of songs as our current maximum, we add them to the count of top singers
        else if (singerCount[singerID] == maxSongs)
        {
            maxSingers++;
        }
    }

    // Finally, we're telling the user how many singers have the most songs
    cout << "Number of singers with the most songs in the playlist: " << maxSingers << endl;

    // We're letting the computer know everything went well and we're finished
    return 0;
}

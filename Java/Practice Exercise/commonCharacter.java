import java.util.ArrayList;
import java.util.List;

class commonCharacter {
    public List<String> commonChars(String[] words) {
        // Step 1: Initialize an array to count frequency of each letter (a-z)
        int[] freq = new int[26]; // Array to store frequency of each letter (index 0 for 'a', index 1 for 'b',
                                  // ..., index 25 for 'z')

        // Step 2: Count frequency of each letter in the first word
        for (char ch : words[0].toCharArray()) {
            freq[ch - 'a']++; // Increment the frequency count for the corresponding letter
        }

        // Step 3: Iterate over the rest of the words to find common characters
        for (int i = 1; i < words.length; i++) {
            String currentString = words[i];
            int[] currentFreq = new int[26]; // Array to store frequency of each letter in the current word

            // Count frequency of each letter in the current word
            for (char ch : currentString.toCharArray()) {
                currentFreq[ch - 'a']++; // Increment the frequency count for the corresponding letter
            }

            // Step 4: Update frequency array to only keep common characters with minimum
            // counts
            for (int j = 0; j < 26; j++) {
                freq[j] = Math.min(freq[j], currentFreq[j]); // Update frequency to minimum of existing and current
                                                             // word's frequency
            }
        }

        // Step 5: Construct the result list based on the final frequency array
        List<Character> result = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = freq[ch - 'a']; // Get the frequency of the current letter

            // Add the letter to the result list 'count' times
            while (count > 0) {
                result.add(ch); // Add the character to the result list
                count--; // Decrement count to add the character 'count' times
            }
        }

        // Step 6: Convert List<Character> to List<String> for the final result
        List<String> stringResult = new ArrayList<>();
        for (Character ch : result) {
            stringResult.add(String.valueOf(ch)); // Convert each character to a string and add to stringResult list
        }

        // Step 7: Return the final list of common characters as strings
        return stringResult;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = { "bella", "label", "roller" };
        List<String> commonChars = solution.commonChars(words);
        System.out.println(commonChars); // Output: ["e", "l", "l"]
    }
}

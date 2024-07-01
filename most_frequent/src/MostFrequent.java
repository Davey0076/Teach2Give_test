import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public static char findMostFrequentChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        // Initialize a HashMap to count frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string to update frequency counts
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the highest frequency
        char mostFrequentChar = str.charAt(0);
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequentChar;
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreq {
	static void characterCount(String inputString)
    {
	// Creating a HashMap containing char
    // as a key and occurrences as  a value
    HashMap<Character, Integer> charCountMap
        = new HashMap<Character, Integer>();

    // Converting given string to char array

    char[] strArray = inputString.toCharArray();

    // checking each char of strArray
    for (char c : strArray) {
        if (charCountMap.containsKey(c)) {

            // If char is present in charCountMap,
            // incrementing it's count by 1
            charCountMap.put(c, charCountMap.get(c) + 1);
        }
        else {

            // If char is not present in charCountMap,
            // putting this char to charCountMap with 1 as it's value
            charCountMap.put(c, 1);
        }
    }

    // Printing the charCountMap
    for (Map.Entry entry : charCountMap.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
}

// Driver Code
public static void main(String[] args)
{
    String str = "hallo hier bin ich!";
    characterCount(str);
}}

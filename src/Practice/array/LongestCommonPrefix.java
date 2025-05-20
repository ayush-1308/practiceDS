package Practice.array;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix l =new LongestCommonPrefix();
        String[] str = {"flower","flow","flight"};
        l.longestCommonPrefix(str);

    }

    public String longestCommonPrefix(String[] strs) {
        String currentPrefix = strs[0];
        for (String currentString:  strs) {
            while ((currentString.length() < currentPrefix.length()) || (!currentPrefix.equals(currentString.substring(0, currentPrefix.length())))) {
                currentPrefix = currentPrefix.substring(0, currentPrefix.length() - 1);
            }
        }
        return currentPrefix;
    }
}

/*

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
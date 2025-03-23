package codeWars;

import java.util.*;

public class KeyboardRow {
    public static void main(String[] args) {
        //["Hello","Alaska","Dad","Peace"]
        String[] arr = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(arr)));

    }

    public static String[] findWords(String[] words) {
       Set<Character> row1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
       Set<Character> row2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
       Set<Character> row3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

       List<String> result = new ArrayList<>();

        for (String word : words) {
            String LowerCase = word.toLowerCase();
            char first = LowerCase.charAt(0);

            Set<Character> row = row1.contains(first) ? row1 : row2.contains(first) ? row2 : row3;

            boolean Valid = true;
            for (char ch : LowerCase.toCharArray()) {
                if (!row.contains(ch)) {
                    Valid = false;
                    break;
                }
            }
            if (Valid) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}

/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
 */
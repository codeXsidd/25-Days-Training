/*
You are given a String s consisting of lowercase English letters. 
  A Substring of length 3 is called good if all 3 characters are distinct. 
  Count the number of good substrings of size 3.

  Example 1:
Input: s = "xyzzaz"
Output: 1

  Example 2:
Input: s = "aababcabc"
Output: 4

  Example 3:
Input: s = "aaa"
Output: 0
  */

Way 1:
public int countGoodSubstrings(String s) {
    int count = 0;
    for (int i = 0; i <= s.length() - 3; i++) {
        char a = s.charAt(i);
        char b = s.charAt(i + 1);
        char c = s.charAt(i + 2);

        if (a != b && a != c && b != c) {
            count++;
        }
    }
    return count;
}

Way 2:
import java.util.HashSet;

public class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            set.add(s.charAt(i + 1));
            set.add(s.charAt(i + 2));
            
            if (set.size() == 3) {
                count++;
            }
        }
        return count;
    }
}

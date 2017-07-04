/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 *
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        boolean result;
        if (s.length() == t.length()) {
            int[] counter = new int[26];
            for (int i = 0; i < s.length(); i++) {
                counter[s.charAt(i) - 'a']++;
                counter[t.charAt(i) - 'a']--;
            }

            result = true;
            for (int count : counter) {
                if (count != 0) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

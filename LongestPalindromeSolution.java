/**
 * Created by peboov on 2017/6/19.
 *
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 *
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * Note:
 * Assume the length of given string will not exceed 1,010.
 *
 * Example:
 *
 * Input:
 * "abccccdd"
 *
 * Output:
 * 7
 *
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 */
public class LongestPalindromeSolution {
    public int longestPalindrome(String s) {
        int pairCount = 0;

        HashSet<Character> set = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                pairCount ++;
            } else {
                set.add(c);
            }
        }

        return set.isEmpty() ? (pairCount * 2) : (pairCount * 2 + 1);
    }
}
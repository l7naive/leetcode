/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombinationsOfAPhoneNumberSolution {
    public List<String> letterCombinations(String digits) {
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> result = new ArrayList<>();

        if (digits != null && digits.length() > 0) {
            result.add("");
            for (int i = 0; i < digits.length(); i++) {
                int num = Integer.parseInt(String.valueOf(digits.charAt(i)));
                result = combine(mapping[num].toCharArray(), result);
                if (i == digits.length() - 1) {
                    break;
                }
            }
        }
        
        return result;
    }

    public List<String> combine(char[] chars, List<String> origin) {
        List<String> result = new ArrayList<>();
        for (String str : origin) {
            for (char c : chars) {
                result.add(str + c);
            }
        }
        return result;
    }
}
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * For example,
 * Given nums = [0, 1, 3] return 2.
 *
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        long sum = 0l;
        for (int num : nums) {
            sum += num;
        }
        return (int)(nums.length * (nums.length + 1) / 2 - sum);
    }
}

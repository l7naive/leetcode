/**
 * Created by peboov on 2017/6/16.
 *
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
 *
 * Given n, find the total number of full staircase rows that can be formed.
 *
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 */
public class ArrangingCoinsSolution {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        long mid = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            if (mid * (mid + 1) / 2 <= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int)(start - 1);
    }
}
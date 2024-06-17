/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                break;
            } else if (guess(mid) == -1) {
                end = mid - 1;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            }
        } 
        return mid;
    }
}
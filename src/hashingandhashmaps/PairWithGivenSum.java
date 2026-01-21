package hashingandhashmaps;
import java.util.HashSet;

/*
 * PairWithGivenSum
 * ----------------
 * Check if an array contains a pair with a given sum.
 * Approach: Use a hash set to track seen numbers.
 */

public class PairWithGivenSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3};
        int target = 7;
        System.out.println(hasPairWithSum(arr, target)); // true
    }
}

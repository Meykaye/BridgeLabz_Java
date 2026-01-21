package hashingandhashmaps;
import java.util.*;

/*
 * ZeroSumSubarrays
 * ----------------
 * Find all subarrays with sum equal to zero.
 * Approach: Use a hash map to store cumulative sum and its indices.
 * If a sum repeats, the elements between previous and current index sum to zero.
 */

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) System.out.println("Subarray from 0 to " + i);

            if (sumMap.containsKey(sum)) {
                for (int startIndex : sumMap.get(sum)) {
                    System.out.println("Subarray from " + (startIndex + 1) + " to " + i);
                }
            }

            sumMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};
        findZeroSumSubarrays(arr);
    }
}

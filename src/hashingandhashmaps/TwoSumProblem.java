package hashingandhashmaps;
import java.util.HashMap;

/*
 * TwoSumProblem
 * -------------
 * Find indices of two numbers that add up to a target.
 * Approach: Store element indices in a hash map while iterating.
 */

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[0]; // no solution
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // 0, 1
    }
}

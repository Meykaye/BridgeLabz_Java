package hashingandhashmaps;
import java.util.HashSet;

/*
 * LongestConsecutiveSequence
 * --------------------------
 * Find the length of the longest consecutive elements sequence.
 * Approach: Store elements in a hash set. For each element, check sequence starting from it.
 */

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) { // start of sequence
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence: " + longestConsecutive(nums)); // 4
    }
}

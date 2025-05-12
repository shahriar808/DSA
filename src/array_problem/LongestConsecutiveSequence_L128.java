package array_problem;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_L128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if(!set.contains(num - 1)){
                int length = 1;
                while(set.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence_L128 solution = new LongestConsecutiveSequence_L128();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = solution.longestConsecutive(nums);
        System.out.println("The length of the longest consecutive sequence is: " + result);
    }
}

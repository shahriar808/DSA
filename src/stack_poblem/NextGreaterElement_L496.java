package stack_poblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement_L496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextGreterMap.put(current, -1);
            } else {
                nextGreterMap.put(current, stack.peek());
            }
            stack.push(current);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreterMap.get(nums1[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        NextGreaterElement_L496 obj = new NextGreaterElement_L496();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = obj.nextGreaterElement(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

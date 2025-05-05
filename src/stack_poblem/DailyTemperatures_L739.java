package stack_poblem;

import java.util.Stack;

public class DailyTemperatures_L739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++){
            int temp = temperatures[i];

            while(!stack.isEmpty() && temp>stack.peek()[0]){
                int[] top = stack.pop();
                int prevIndex = top[1];
                res[prevIndex] = i-prevIndex;
            }
            stack.push(new int[]{temp,i});
        }
        return res;
    }
    public static void main(String[] args) {
        DailyTemperatures_L739 obj = new DailyTemperatures_L739();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = obj.dailyTemperatures(temperatures);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

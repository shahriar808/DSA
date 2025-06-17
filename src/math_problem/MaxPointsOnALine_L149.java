package math_problem;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine_L149 {
    public int maxPoints(int[][] points) {
        int max = 0;
        for (int[] x : points) {
            Map<Double, Integer> map = new HashMap<>();
            for (int[] y : points) {
                if (x == y) continue;
                double slope = 0;
                if (x[0] == y[0]) {
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    slope = (double) (y[1] - x[1]) / (y[0] - x[0]);
                }
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }
        }
        return max + 1;
    }
    public static void main(String[] args) {
        MaxPointsOnALine_L149 solution = new MaxPointsOnALine_L149();
        int[][] points = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int result = solution.maxPoints(points);
        System.out.println("Maximum points on a line: " + result); // Output: 5
    }
}

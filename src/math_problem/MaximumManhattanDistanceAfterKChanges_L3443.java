package math_problem;

public class MaximumManhattanDistanceAfterKChanges_L3443 {
    public int maxDistance(String s, int k) {
        int ans = 0;
        int north = 0, south = 0, east = 0, west = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'N') north++;
            else if (c == 'S') south++;
            else if (c == 'E') east++;
            else if (c == 'W') west++;
            int x = Math.abs(north - south);
            int y = Math.abs(east - west);
            int MD = x + y;
            int dis = MD + Math.min(2 * k, i + 1 - MD);
            ans = Math.max(ans, dis);
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumManhattanDistanceAfterKChanges_L3443 solution = new MaximumManhattanDistanceAfterKChanges_L3443();
        String s = "NSWWEW";
        int k = 3;
        int result = solution.maxDistance(s, k);
        System.out.println("Maximum Manhattan distance after " + k + " changes: " + result); // Output: 6
    }
}

package math_problem;

public class WaterAndJugProblem_L365 {
    public boolean canMeasureWater(int x, int y, int target) {
        int u, max = 0;
        if (x > y) {
            u = x;
        } else {
            u = y;
        }
        if (x + y < target) {
            return false;
        }
        for (int i = 1; i <= u; i++) {
            if (x % i == 0 && y % i == 0) {
                max = Math.max(i, max);
            }
        }
        if (target % max == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        WaterAndJugProblem_L365 solution = new WaterAndJugProblem_L365();
        int x = 3, y = 5, target = 4;
        boolean result = solution.canMeasureWater(x, y, target);
        System.out.println("Can measure " + target + " liters: " + result); // Output: true
    }
}

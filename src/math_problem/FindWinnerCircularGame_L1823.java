package math_problem;

public class FindWinnerCircularGame_L1823 {
    public int findTheWinner(int n, int k) {
        int winner=0;
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1;
    }
    public static void main(String[] args) {
        FindWinnerCircularGame_L1823 solution = new FindWinnerCircularGame_L1823();
        int n = 5, k = 2;
        int winner = solution.findTheWinner(n, k);
        System.out.println("The winner is: " + winner); // Output: The winner is: 3
    }
}

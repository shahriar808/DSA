package search_problem;

public class KokoEatingBananas_L875 {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pill : piles) {
            max = Math.max(pill, max);
        }
        if (h == piles.length) return max;
        int left = 1;
        int right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEat(piles, mid) <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int canEat(int[] nums, int k) {
        int hours = 0;
        for (int num : nums) {
            hours += (num + k - 1) / k;
        }
        return hours;
    }

    public static void main(String[] args) {
        KokoEatingBananas_L875 obj = new KokoEatingBananas_L875();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int result = obj.minEatingSpeed(piles, h);
        System.out.println("Minimum : " + result + " bananas to eat each hour to complete all within " + h + " hours");
    }
}

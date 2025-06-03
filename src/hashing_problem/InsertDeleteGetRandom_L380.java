package hashing_problem;

import java.util.*;

public class InsertDeleteGetRandom_L380 {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random rand;

    public InsertDeleteGetRandom_L380() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        map.put(lastElement, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
    public static void main(String[] args) {
        InsertDeleteGetRandom_L380 solution = new InsertDeleteGetRandom_L380();
        System.out.println(solution.insert(1)); // true
        System.out.println(solution.insert(2)); // true
        System.out.println(solution.insert(3)); // true
        System.out.println(solution.remove(2)); // true
        System.out.println(solution.getRandom()); // Randomly returns 1 or 3
    }
}

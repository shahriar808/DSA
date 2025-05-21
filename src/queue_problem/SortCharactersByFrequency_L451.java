package queue_problem;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency_L451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char c = entry.getKey();
            int freq = entry.getValue();
            sb.append(String.valueOf(c).repeat(Math.max(0, freq)));
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        SortCharactersByFrequency_L451 solution = new SortCharactersByFrequency_L451();
        String s = "tree";
        String result = solution.frequencySort(s);
        System.out.println("Sorted string by frequency: " + result);
    }
}

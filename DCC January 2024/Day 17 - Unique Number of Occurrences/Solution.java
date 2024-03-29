// Problem Link : https://leetcode.com/problems/unique-number-of-occurrences/description/

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i : map.values()) {
            set.add(i);
        }

        return map.size() == set.size();
    }
}
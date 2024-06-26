// Problem Link : https://leetcode.com/problems/isomorphic-strings/description/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapping = new int[256];
        boolean[] visited = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapping[charS] == 0) {
                if (visited[charT]) {
                    return false;
                }
                mapping[charS] = charT;
                visited[charT] = true;
            } else {
                if (mapping[charS] != charT) {
                    return false;
                }
            }
        }

        return true;
    }
}

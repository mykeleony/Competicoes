package leetcode.is_subsequence;

// Resolução do problema: https://leetcode.com/problems/is-subsequence
public class Solution {
    public static void main(String[] args) {
        System.out.println("Must be false: " + isSubsequence("aaaaaa", "bbaaaa"));
        System.out.println("Must be true: " + isSubsequence("abc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int indexS = 0;
        int indexT = 0;

        while (indexT < t.length() && indexS < s.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
            }

            indexT++;
        }

        return indexS == s.length();
    }
}

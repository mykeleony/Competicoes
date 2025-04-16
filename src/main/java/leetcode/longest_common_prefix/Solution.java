package leetcode.longest_common_prefix;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Must be unique: " + longestCommonPrefix(new String[]{"unique"}));
        System.out.println("Must be a: " + longestCommonPrefix(new String[]{"a"}));
        System.out.println("Must be empty: " + longestCommonPrefix(new String[]{"", "a"}));
        System.out.println("Must be empty: " + longestCommonPrefix(new String[]{"a", ""}));
        System.out.println("Must be empty: " + longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println("Must be 'fl': " + longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // Verifica o mesmo caractere em todas as outras strings
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}

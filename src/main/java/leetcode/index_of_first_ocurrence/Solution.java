package leetcode.index_of_first_ocurrence;


// Solução do problema: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
public class Solution {
    public static void main(String[] args) {
        System.out.println("h: mississippi, n: issip: " + strStr("mississippi", "issip"));
        System.out.println("h: sadbutsad, n: sad: " + strStr("sadbutsad", "sad"));
        System.out.println("h: a, n: a: " + strStr("a", "a"));
        System.out.println("h: mississippi, n: issi: " + strStr("mississippi", "issi"));
    }

    public static int strStr(String haystack, String needle) {
        int i = 0;

        while (haystack.length() - i >= needle.length()) {
            int matchedLength = 0;

            while (haystack.charAt(i++) == needle.charAt(matchedLength++)) {    // O(n * m)
                if (matchedLength == needle.length()) {
                    return i - matchedLength;
                }
            }

            i -= matchedLength - 1;
        }

        return -1;
    }
}

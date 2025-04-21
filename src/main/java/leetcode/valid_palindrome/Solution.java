package leetcode.valid_palindrome;

// Resolução do problema: https://leetcode.com/problems/valid-palindrome
public class Solution {
    public static void main(String[] args) {
        System.out.println("Must be false: " + isPalindrome("race a car"));
        System.out.println("Must be true: " + isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        int esquerda = 0;
        int direita = s.length() - 1;

        while (esquerda < direita) {
            char e = s.charAt(esquerda);
            char d = s.charAt(direita);

            if (!Character.isLetterOrDigit(e)) {
                esquerda++;
            } else if (!Character.isLetterOrDigit(d)) {
                direita--;
            } else {
                if (Character.toLowerCase(e) != Character.toLowerCase(d)) {
                    return false;
                }

                esquerda++;
                direita--;
            }
        }

        return true;
    }
}

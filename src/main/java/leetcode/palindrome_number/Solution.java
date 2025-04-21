package leetcode.palindrome_number;

// Solução para o problema: https://leetcode.com/problems/palindrome-number
public class Solution {
    public static void main(String[] args) {
        System.out.println("Must be true: " + isPalindromeWithoutStringConversion(121));
        System.out.println("Must be true: " + isPalindromeWithoutStringConversion(0));
        System.out.println("Must be false: " + isPalindromeWithoutStringConversion(-121));
        System.out.println("Must be false: " + isPalindromeWithoutStringConversion(1121));
        System.out.println("Must be true: " + isPalindromeWithStringConversion(121));
        System.out.println("Must be true: " + isPalindromeWithStringConversion(0));
        System.out.println("Must be false: " + isPalindromeWithStringConversion(-121));
        System.out.println("Must be false: " + isPalindromeWithStringConversion(1121));
    }

    public static boolean isPalindromeWithoutStringConversion(int x) {
        // 1. Números negativos não são palíndromos por conta do sinal
        // 2. Números terminados em 0, exceto o próprio 0, não são palíndromos, pois zeros à esquerda são ignorados
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int metadeInvertida = 0;

        while (x > metadeInvertida) {
            metadeInvertida = metadeInvertida * 10 + x % 10;    // Anexa à metade invertida o último dígito de x
            x /= 10;    // Remove último dígito de x
        }

        // Quando o comprimento é ímpar, ignora o dígito central
        return x == metadeInvertida || x == metadeInvertida / 10;
    }

    public static boolean isPalindromeWithStringConversion(int x) {
        String s = String.valueOf(x);
        int esquerda = 0;
        int direita = s.length() - 1;

        while (esquerda <= direita) {
            if (s.charAt(esquerda) != s.charAt(direita)) {
                return false;
            }

            esquerda++;
            direita--;
        }

        return true;
    }
}
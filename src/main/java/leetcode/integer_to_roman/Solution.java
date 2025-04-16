package leetcode.integer_to_roman;

public class Solution {
    public static void main(String[] args) {
        System.out.println("1: " + intToRoman(1));
        System.out.println("5: " + intToRoman(5));
        System.out.println("10: " + intToRoman(10));
        System.out.println("50: " + intToRoman(50));
        System.out.println("100: " + intToRoman(100));
        System.out.println("500: " + intToRoman(500));
        System.out.println("1000: " + intToRoman(1000));
        System.out.println("1004: " + intToRoman(1004));
        System.out.println("3749: " + intToRoman(3749));
    }

    public static String intToRoman(int num) {
        int[] decimais = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < decimais.length && num > 0; i++) {
            while (num >= decimais[i]) {
                num -= decimais[i];
                resultado.append(romanos[i]);
            }
        }

        return resultado.toString();
    }
}

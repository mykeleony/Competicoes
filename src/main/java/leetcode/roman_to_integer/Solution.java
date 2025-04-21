package leetcode.roman_to_integer;

// Solução do problema: https://leetcode.com/problems/roman-to-integer
public class Solution {
    public static void main(String[] args) {
        System.out.println("I: " + romanToInt("I"));
        System.out.println("II: " + romanToInt("II"));
        System.out.println("III: " + romanToInt("III"));
        System.out.println("IV: " + romanToInt("IV"));
        System.out.println("V: " + romanToInt("V"));
    }

    public static int romanToInt(String s) {
        int numAnterior = 0;
        int resultado = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int atual = RomanosEnum.fromChar(s.charAt(i));

            if (atual < numAnterior) {
                atual *= -1;
            }

            resultado += atual;
            numAnterior = atual;
        }

        return resultado;
    }
}

enum RomanosEnum {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private final int valorDecimal;

    public static int fromChar(char ch) {
        return RomanosEnum.valueOf(String.valueOf(ch)).getValorDecimal();
    }

    RomanosEnum(int valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    public int getValorDecimal() {
        return valorDecimal;
    }
}

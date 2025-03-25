package beecrowd.numeros_impares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int limite = new Scanner(System.in).nextInt();

        for (int i = 1; i <= limite; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
}

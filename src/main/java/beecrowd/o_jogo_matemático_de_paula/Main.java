package beecrowd.o_jogo_matemático_de_paula;

import java.util.Scanner;

/*
 * Solução em Java para o problema: https://judge.beecrowd.com/pt/problems/view/1192
 *
 * por Myke Amorim
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdTestes = scanner.nextInt();
        int digitoEsquerdo;
        char letra;
        int digitoDireito;

        for (int i = 0; i < qtdTestes; i++) {
            String input = scanner.next();

            digitoEsquerdo = Character.getNumericValue(input.charAt(0));
            letra = input.charAt(1);
            digitoDireito = Character.getNumericValue(input.charAt(2));

            if (digitoEsquerdo == digitoDireito) {
                System.out.println(digitoEsquerdo * digitoDireito);
            } else if (letra >= 97) {      // Minúscula
                System.out.println(digitoEsquerdo + digitoDireito);
            } else {                       // Maiúscula
                System.out.println(digitoDireito - digitoEsquerdo);
            }
        }
    }
}

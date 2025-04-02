package beecrowd.cara_ou_coroa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int qtdJogadas = scanner.nextInt();

            if (qtdJogadas == 0) {
                break;
            }

            int resultado;
            int pontuacaoMaria = 0;
            int pontuacaoJoao = 0;

            for (int i = 0; i < qtdJogadas; i++) {
                resultado = scanner.nextInt();  // 0 = cara; 1 = coroa

                if (resultado == 0) {
                    pontuacaoMaria++;   // Maria sempre escolhe cara
                } else {
                    pontuacaoJoao++;    // João sempre escolhe coroa
                }
            }

            System.out.println("Mary won " + pontuacaoMaria + " times and John won " + pontuacaoJoao + " times");
        }

        scanner.close();
    }
}

package identificando_o_cha;

import java.util.Scanner;

/*
 * Solução em Java para o problema: https://judge.beecrowd.com/pt/problems/view/2006
 *
 * por Myke Amorim
 * */
public class Main {
    private int contaAcertos(int tipoCha, int[] palpites) {
        int contador = 0;

        for (int palpite : palpites) {
            if (palpite == tipoCha) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoCha = scanner.nextInt();
        int qtdPalpites = 5;
        int[] palpites = new int[qtdPalpites];

        // Preenche
        for (int i = 0; i < qtdPalpites; i++) {
            palpites[i] = scanner.nextInt();
        }

        System.out.println(new Main().contaAcertos(tipoCha, palpites));
    }
}

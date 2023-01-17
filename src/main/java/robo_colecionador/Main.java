package robo_colecionador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Solução em Java para o problema da Maratona de Programação da SBC: https://www.beecrowd.com.br/judge/pt/problems/view/1121
*
* por Myke Amorim
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();

            if(n == 0 && m == 0 && s == 0)
                break;

            char[][] arena = new char[n][m];

            char pos = 0;
            int i = 0, j = 0;

            for (int k = 0; k < n; k++) {
                char[] elementos = scanner.next().toCharArray();

                for (int l = 0; l < elementos.length; l++) {
                    if (Character.isAlphabetic(elementos[l])) {
                        pos = elementos[l];
                        i = k;
                        j = l;
                        break;
                    }
                }

                System.arraycopy(elementos, 0, arena[k], 0, m);
            }

            List<Character> comandos = new ArrayList<>();

            for (char c : scanner.next().toCharArray())
                comandos.add(c);

            int pont = 0;

            for (char comando : comandos) {
                if (comando != 'F')
                    pos = novaPosicao(pos, comando);

                else {
                    int iAnterior = i;
                    int jAnterior = j;

                    // Vai para frente se o movimento for válido.
                    switch (pos) {
                        case 'N' -> i = (i - 1 >= 0) ? (i - 1) : i;
                        case 'S' -> i = (i + 1 <= n - 1) ? (i + 1) : i;
                        case 'L' -> j = (j + 1 <= m - 1) ? (j + 1) : j;
                        case 'O' -> j = (j - 1 >= 0) ? (j - 1) : j;
                    }

                    switch (arena[i][j]) {
                        // Pilastra
                        case '#' -> {
                            i = iAnterior;
                            j = jAnterior;
                        }
                        // Figurinha da copa
                        case '*' -> {
                            pont++;
                            arena[iAnterior][jAnterior] = '.';
                            arena[i][j] = pos;
                        }
                    }
                }
            }

            System.out.println(pont);
        }
    }

    // Muda o sentindo do robô
    public static char novaPosicao(char ant, char mov) {
        char res = 0;

        // 90 graus à direita
        if (mov == 'D') {
            switch (ant) {
                case 'N' -> res = 'L';
                case 'S' -> res = 'O';
                case 'L' -> res = 'S';
                case 'O' -> res = 'N';
            }
        }

        // 90 graus à esquerda
        else if (mov == 'E') {
            switch(ant) {
                case 'N' -> res = 'O';
                case 'S' -> res = 'L';
                case 'L' -> res = 'N';
                case 'O' -> res = 'S';
            }
        }

        return res;
    }

}

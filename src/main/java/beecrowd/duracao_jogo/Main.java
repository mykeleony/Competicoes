package beecrowd.duracao_jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Solução em Java para o problema: https://www.beecrowd.com.br/judge/pt/problems/view/1046
*
* por Myke Amorim
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> h = new ArrayList<>();

        for (int i = 0; i < 24; i++)
            h.add(i);

        int c = 0;

        while (true) {
            // Hora seguinte
            n = (n + 1) % h.size();
            c++;

            if (n == k)     // Finaliza quando a hora final é alcançada na lista.
                break;
        }

        System.out.println("O JOGO DUROU " + c + " HORA(S)");
    }
}

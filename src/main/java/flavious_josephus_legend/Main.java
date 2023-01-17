package flavious_josephus_legend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Solução em Java para o problema: https://www.beecrowd.com.br/judge/pt/problems/view/1030
*
* por Myke Amorim
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdTestes = scanner.nextInt();

        for (int i = 0; i < qtdTestes; i++) {
            int qtdPessoas = scanner.nextInt();
            int distancia = scanner.nextInt();

            List<Integer> pessoas = new ArrayList<>();

            // Preenche o círculo com a quantidade de pessoas especificadas
            for(int j = 0; j < qtdPessoas; j++)
                pessoas.add(j + 1);

            int atual = 0;

            // Remove até sobrar 1 elemento no círculo
            while(pessoas.size() > 1) {
                atual = (atual + distancia - 1) % pessoas.size();

                pessoas.remove(atual);
            }

            System.out.println("Case " + (i + 1) + ": " + pessoas.get(0));
        }
    }
}

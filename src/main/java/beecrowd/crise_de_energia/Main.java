package beecrowd.crise_de_energia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
* Solução em Java para o problema: https://www.beecrowd.com.br/judge/pt/problems/view/1031
*
* por Myke Amorim
* */
public class Main {

    public static boolean mFunciona(int m, int n) {
        List<Integer> regioes = new ArrayList<>();

        for(int i = 1; i <= n; i++)
            regioes.add(i);

        int index = 0;

        while(regioes.size() > 1) {
            regioes.remove(index);

            index = (index + m - 1) % regioes.size();
        }

        return regioes.get(0) == 13;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m;

        while(true) {
            n = scanner.nextInt();
            m = 1;

            if (n == 0) break;

            while(!mFunciona(m, n))
                m++;

            System.out.println(m);
        }
    }
}

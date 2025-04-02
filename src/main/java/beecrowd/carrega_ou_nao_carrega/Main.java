package beecrowd.carrega_ou_nao_carrega;

import java.util.Scanner;

/*
 * Solução em Java para o problema: https://judge.beecrowd.com/pt/problems/view/1026
 *
 * por Myke Amorim
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            // Usar long para ler valores maiores que Integer.MAX_VALUE
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            // Converter para inteiros sem sinal (tratando como 32 bits)
            int unsignedA = (int) a;
            int unsignedB = (int) b;

            // Operação XOR
            int resultado = unsignedA ^ unsignedB;

            // Imprimir o resultado como inteiro sem sinal
            System.out.println(Integer.toUnsignedLong(resultado));
        }

        scanner.close();
    }
}

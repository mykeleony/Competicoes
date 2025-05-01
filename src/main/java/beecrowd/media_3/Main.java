package beecrowd.media_3;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * Solution for Beecrowd problem #1040. Média 3.
 * <p>
 * Read four numbers (N1, N2, N3, N4), each one with one digit after the decimal point, corresponding to 4 scores obtained by a student.
 * Calculate the average with weights 2, 3, 4 and 1 respectively, for these 4 scores and show this average accompanied by the message "Media: ".
 * If this average is equal or greater than 7.0, print the message "Aluno aprovado.". If the average calculated is less than 5.0, print the message "Aluno reprovado.".
 * If the average calculated is a value between 5.0 and 6.9, including these, the program must print the message "Aluno em exame.".
 * <p>
 * In case the student is in exam, read one more value corresponding to the exam score obtained by the student. Print then the message "Nota do exame: " followed by the score typed.
 * Then recalculate the average (sum the exam score with the average previously calculated and divide by 2). and print the message "Aluno aprovado." (case the final average is 5.0 or more )
 * or "Aluno reprovado.", (case the average has become 4.9 or less). For these two cases (approved or reproved after the exam) present in the last line a message "Media final: " followed by the final average for this student.
 * <p>
 * Problem Link: <a href="https://judge.beecrowd.com/pt/problems/view/1040">Beecrowd 1040</a>
 */
public class Main {
    private static final double[] WEIGHTS = {2.0, 3.0, 4.0, 1.0};
    private static final DecimalFormat DF = new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(Locale.US));

    public static void main(String[] args) throws IOException {
        double sum = 0;
        double divisor = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for (double weight : WEIGHTS) {
            double grade = sc.nextDouble();

            sum += grade * weight;
            divisor += weight;
        }

        double avg = sum / divisor;
        boolean inExam = false;

        DF.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Media: " + DF.format(avg));

        if (avg >= 5.0 && avg < 7.0) {
            System.out.println("Aluno em exame.");

            inExam = true;
            double examGrade = sc.nextDouble();

            System.out.println("Nota do exame: " + DF.format(examGrade));

            avg = (avg + examGrade) / 2.0;
        }

        if (avg >= 5.0) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        if (inExam) {
            System.out.println("Media final: " + DF.format(avg));
        }
    }
}

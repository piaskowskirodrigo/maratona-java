package academy.devdojo.maratonajava.logica.Arrayss;

import java.util.Scanner;

public class ExercicioArray2 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota "+ (i + 1));

            notas[i] = scanner.nextDouble();

        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i +1) + ": " +notas[i]);

        }
    }
}

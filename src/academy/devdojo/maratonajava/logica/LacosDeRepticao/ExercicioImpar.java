package academy.devdojo.maratonajava.logica.LacosDeRepticao;

import java.util.Scanner;

public class ExercicioImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sum numero: ");
        int numeroFinal = input.nextInt();
        int i = 0;

        while (i <= numeroFinal) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);

            }
            i = i + 1;
        }

    }
}



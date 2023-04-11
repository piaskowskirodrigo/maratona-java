package academy.devdojo.maratonajava.logica.LacosDeRepticao.Fors;

import java.util.Scanner;

public class ExercicioForsTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num * i);
        }
    }
}

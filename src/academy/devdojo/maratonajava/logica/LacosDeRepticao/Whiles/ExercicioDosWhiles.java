package academy.devdojo.maratonajava.logica.LacosDeRepticao.Whiles;

import java.util.Scanner;

public class ExercicioDosWhiles {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("PLAYER1: Digite um numero de 1 a 10");
            int num1 = scanner.nextInt();
            System.out.println("PLAYER2: Digite um numero de 1 a 10");
            int num2 = scanner.nextInt();
            System.out.println("Acertou" + (num1 == num2));
            System.out.println("---------------------------------------");
            System.out.println("Deseja continuar? ");
            System.out.println("1. SIM");
            System.out.println("2. NAO");
            desejaContinuar = scanner.nextInt();

        } while (desejaContinuar ==1);
    }
}


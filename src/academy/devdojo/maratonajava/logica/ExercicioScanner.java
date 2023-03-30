package academy.devdojo.maratonajava.logica;

import java.util.Scanner;

public class ExercicioScanner {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual e seu nome? ");
        String nome = teclado.next();

        System.out.println("Seu nome e " + nome);

    }
}

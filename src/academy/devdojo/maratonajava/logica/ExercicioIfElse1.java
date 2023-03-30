package academy.devdojo.maratonajava.logica;
/*Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão
informados	valores	iguais)	e	escrever	o	maior	deles. */

import java.util.Scanner;

public class ExercicioIfElse1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = input.nextInt();
        System.out.println("Digite um diferente numero: ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("O numero maior e: " + num1);
        } else {
            System.out.println("O numero maior e: " + num2);
        }

    }
}

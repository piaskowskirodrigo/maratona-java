package academy.devdojo.maratonajava.logica;
/* Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 nascimento	 de	 uma	 pessoa	 e
escrever	 uma	 mensagem	 que	 diga	 se	 ela	 poderá	 ou	 não	 votar	 este	 ano */

import java.util.Scanner;

public class ExercicioIfElse2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu ano de nascimento? ");
        int ano = input.nextInt();
        int anoAtual = 2023;
        int idadeMinVotar = 16;
        int somaAnos = (anoAtual - ano);

        if (somaAnos >= idadeMinVotar) {
            System.out.println("Voce pode votar esse ano");
        } else {
            System.out.println("Voce nao pode votar esse ano");
        }
    }
}

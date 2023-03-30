package academy.devdojo.maratonajava.logica;

import java.util.Scanner;

public class ExercicioNtacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        if (idade <= 10) {
            System.out.println(idade + "Participara da categoria infantil");
        } else if (idade >= 11 && idade <=15) {
            System.out.println(idade + "Participara da categoria juvenil");
        } else if (idade >= 16 && idade <=19) {
            System.out.println(idade + "Participara da categoria pre adulto");
        } else{
            System.out.println(idade + "Participara da categoria adulto");
        }
    }
}

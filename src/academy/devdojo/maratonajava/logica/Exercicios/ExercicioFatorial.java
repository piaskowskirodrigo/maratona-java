package academy.devdojo.maratonajava.logica.Exercicios;

public class ExercicioFatorial {
    //*Elaborar um programa que calcule o fatorial de um número inteiro
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i <= 5; i++) {

            fatorial *= i; //* = i * i

            System.out.println("fatorial de " +i+"=" +fatorial);


        }
    }
}

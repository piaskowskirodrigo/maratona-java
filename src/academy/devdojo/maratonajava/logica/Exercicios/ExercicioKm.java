package academy.devdojo.maratonajava.logica.Exercicios;

import java.util.Scanner;

public class ExercicioKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas horas de viagem? ");
        Double horas = scanner.nextDouble();
        System.out.println("Qual foi a velocidade? ");
        int velocidade = scanner.nextInt();

        Double distancia = horas * velocidade;
        System.out.println("Sua distancia foi de "+distancia + "KM");
//*supondo que o veiculo faca uma autonomia de 12km/L
        double litros = distancia / 12;
        System.out.println("Voce gastou "+ litros+ " em sua viagem");
    }
}

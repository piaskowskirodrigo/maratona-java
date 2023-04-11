package academy.devdojo.maratonajava.logica.LacosDeRepticao.Whiles;

import java.util.Scanner;

public class ExercicioWhile2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i == 0 ) {
            System.out.println("Escolha uma opcao abaixo: ");
            System.out.println("1 - Calcular impostos");
            System.out.println("2 - Depositar salario");
            System.out.println("3 - Sair");

            int menu = input.nextInt();

            switch(menu){
                case 1:
                    System.out.println("Calculando o imposto");
                    break;
                case 2:
                    System.out.println("Depositando salario");
                    break;
                case 3:
                    i = 1;
                    System.out.println("Acesso finalizado");
                    break;
                default:
                    System.out.println("Opção inválida!");


            }
        }

    }
}

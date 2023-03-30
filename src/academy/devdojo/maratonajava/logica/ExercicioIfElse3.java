package academy.devdojo.maratonajava.logica;
/*Escreva	 um	 programa	 que	 verifique	 a	 validade	 de	 uma	 senha	 fornecida
pelo	 usuário.	 A	 senha	 válida	 é	 o	 número	 1234.	Devem	 ser	impressas	 as
seguintes	mensagens:
ACESSO	PERMITIDO	caso	a	senha	seja	válida.
ACESSO	NEGADO	caso	a	senha	seja	inválida.*/

import java.util.Scanner;

public class ExercicioIfElse3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Favor digitar a sua senha");
        int senha = input.nextInt();

        if (senha == 1234) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso nao permitido");
        }

    }
}

package academy.devdojo.maratonajava.logica.LacosDeRepticao.Whiles;
/*Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e
senha corretos devem estar armazenados em constantes no seu programa. Se o
usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO, caso
contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha,
essa condição deve-se repetir até que o usuário acerte a combinação.*/


import java.util.Scanner;

public class ExercicioDesafio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String login = "";
        int senha = 0;

        while (login != "usuario" && senha != 1234) {

            System.out.println("Por favor digite seu  login: ");
            login = input.next();

            System.out.println("Por favor digite sua senha: ");
            senha = input.nextInt();

            if (login != "usuario" && senha != 1234) {
                System.out.println("Acesso negado: ");

            }
            System.out.println("Acesso liberado");

        }

    }
}

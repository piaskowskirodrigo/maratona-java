package academy.devdojo.maratonajava.logica.Exercicios;
/*Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e
senha corretos devem estar armazenados em constantes no seu programa. Se o
usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO, caso
contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha,
essa condição deve-se repetir até que o usuário acerte a combinação.*/

import java.util.Scanner;

public class ExercicioLogin {
    public static void main(String[] args) {
        int login = 1234;
        int senha = 1234;
        boolean acessoConcedido = false;

        while (!acessoConcedido) {  //* aqui defini um boolean para o while parar quando acertar a senha
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite seu login ");
            int login2 = scanner.nextInt();
            System.out.println("Digite sua senha ");
            int senha2 = scanner.nextInt();

            if (login == login2 || senha == senha2) {
                System.out.println("Login efetuado com sucesso");
                acessoConcedido = true;
            } else {
                System.out.println("Acesso negado");
            }
        }
    }
}









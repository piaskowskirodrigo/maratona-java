package logica;

//Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação
// e a divisão dos números lidos

import org.w3c.dom.ls.LSOutput;

public class ExercicioOperacoesArit {
    public static void main(String[] args) {


        int numA = 5;
        int numB = 4;


        int soma = numA + numB;
        int subtracao = numA - numB;
        int multiplicacaO = numA * numB;
        float divisao = numA / numB;

        System.out.println("A soma do numA e numB e: "+ soma);
        System.out.println("A subtracao do numA e numB e: "+ subtracao);
        System.out.println("A multiplicacao do numA e numB e: "+ multiplicacaO);
        System.out.println("A divisao do numA e numB e: "+ divisao);


    }
}

package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisnumeros(num1, num2);
        System.out.println("CalculadoraTest4");
        System.out.println("num1 " + num1);
        System.out.println("num2 " +num2);
    }
}

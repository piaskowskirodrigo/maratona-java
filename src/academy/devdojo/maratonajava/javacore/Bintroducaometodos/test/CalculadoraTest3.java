package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora =  new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);

    }
}

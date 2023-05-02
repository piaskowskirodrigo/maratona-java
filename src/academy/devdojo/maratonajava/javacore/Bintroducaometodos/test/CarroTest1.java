package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiesta";
        carro1.modelo = "Ford";
        carro1.ano = 2014;

        carro2.nome = "Fusca";
        carro2.modelo = "Volks";
        carro2.ano = 1980;

//* Tecla CTR+D ---- DUPLICA A LINHA
        System.out.println("carro1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("\ncarro2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}

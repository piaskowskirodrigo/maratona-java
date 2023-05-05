package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "rodrigo";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Joana";
        estudante2.idade = 17;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);

        impressora.imprime(estudante2);

        System.out.println(estudante1.nome);
        System.out.println(estudante1.sexo);
        System.out.println(estudante1.idade);

        System.out.println("-------------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);

    }
}

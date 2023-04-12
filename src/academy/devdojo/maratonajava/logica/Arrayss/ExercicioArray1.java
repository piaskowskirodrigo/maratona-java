package academy.devdojo.maratonajava.logica.Arrayss;

public class ExercicioArray1 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        notas[0] = 10.0;
        notas[1] = 8.0;
        notas[2] = 7.0;
        notas[3] = 3;
        for (int i = 0; i < 4; i++) { /*O numero 4 e o tamanho do array, poderia ser tambem <= 3*/
            System.out.println(notas[i]);

        }

    }
}

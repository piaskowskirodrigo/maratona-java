package academy.devdojo.maratonajava.logica;

public class ExercicioAprovado {
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 8;
        int nota3 = 5;
        int nota4 = 10;
        int media = (nota1 + nota2+ nota3+ nota4) / 4;

        if (media >= 7 ){
            System.out.println("Sua media e de =" + media + ", Parabens voce passou!!!");
        }
        else {
            System.out.println("Sua media e de = " + media + ",  voce reprovou!!!");

        }

    }
}

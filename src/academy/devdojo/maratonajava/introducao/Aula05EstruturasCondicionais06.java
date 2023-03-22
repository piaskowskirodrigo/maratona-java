package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        int dia = 7;
        switch (dia){
            case 1:
                System.out.println("Domingo, fim de semana");
                break;
            case 2:
                System.out.println("Sgunda, dia de semana");
                break;
            case 3:
                System.out.println("Terca, dia de semana");
                break;
            case 4:
                System.out.println("Quarta, dia de semana");
                break;
            case 5:
                System.out.println("Quinta, dia de semana");
                break;
            case 6:
                System.out.println("Sexta, dia de semana");
                break;
            case 7:
                System.out.println("Sabado, Fim de semana");
                break;
            default:
                System.out.println("Opção invalida");


        }
    }
}

package academy.devdojo.maratonajava.logica.If.Else;
/*As	maçãs	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma
dúzia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um
programa	 que	 leia	 o	 número	 de	 maçãs	 compradas,	 calcule	 e	 escreva	 o
valor	total	da	compra */

public class ExercicioIfElse4 {

    public static void main(String[] args) {
        int numeroMacas = 2;
        double valor1 = 30;
        double valor2 = 25;
        double total;

        if (numeroMacas < 12 ){
            total = numeroMacas * valor1;
        } else {
            total = numeroMacas * valor2;
        }
        System.out.println(total);

    }
}




package academy.devdojo.maratonajava.introducao;

public class exercicios {

    /*4. As	maçãs	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma
        dúzia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um
        programa	 que	 leia	 o	 número	 de	 maçãs	 compradas,	 calcule	 e	 escreva	 o
        valor	total	da	compra.*/
  /*  public static void main(String[] args) {
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
*/
/*public static void main(String[]args){
/*Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão
informados	valores	iguais)	e	escrever	o	maior	deles


    int numero1 = 50;
    int numero2 = 10;
    int numeroMaior;

    if(numero1 < numero2){
        numeroMaior = numero2;
    } else {
        numeroMaior = numero1;
    }
    System.out.println(numeroMaior);


}
}
*/
    /*public static void main(String[] args) {
        /*Escreva	 um	 programa	 que	 verifique	 a	 validade	 de	 uma	 senha	 fornecida
pelo	 usuário.	 A	 senha	 válida	 é	 o	 número	 1234.	Devem	 ser	impressas	 as
seguintes	mensagens:
ACESSO	PERMITIDO	caso	a	senha	seja	válida.
ACESSO	NEGADO	caso	a	senha	seja	inválida
        String senha = "1234";
        String senhaTeste = "1234";
        String resultado;
        if (senha == senhaTeste){
            resultado = "Acesso permitido";
        }else {
            resultado = "Acesso Nao permitido";
        }
        System.out.println(resultado)
         */


    /*public static void main(String[] args) {
        //Escrever um programa java que receba dois números e exiba o
        //resultado da sua soma.
        int numero1 = 11;
        int numero2 = 10;
        int soma;
        int subtracao;
        int multiplicacao;
        subtracao = (numero1) - (numero2);
        multiplicacao = numero1 * numero2;
        soma = numero1 + numero2;

        System.out.println("A soma dos dois numeros é "+soma);
        System.out.println("A subtracao dos dois numeros é "+subtracao);
        System.out.println("A multiplicacao dos dois numeros é "+multiplicacao);
        */

    /* public static void main(String[] args) {
         //Escrever um programa que leia o nome de um vendedor, o seu
         //salário fixo e o total de vendas efetuadas por ele no mês (em
         //dinheiro). Sabendo que este vendedor ganha 15% de comissão
         //sobre suas vendas efetuadas, informar o seu nome, o salário fixo e
         //salário no final do mês.

         String nomeVendedor ="Fernando";
         Double salarioVendedor = 1200.0;
         Double  numeroVendas = 2000.0;
         Double comissao = numeroVendas * 15/100;
         Double salarioFinal = salarioVendedor + comissao;

         System.out.println("Seu salario final é"+salarioFinal);

    }

     */
    /*public static void main(String[] args) {
        for (int i = 1; i<= 100; i= i +2){
            //if (i % 2 != 0)
            System.out.println(i);*/


   /* public static void main(String[] args) {
        int i = 1;
        while(i <= 1000) {
            if(i % 100 == 0){
                System.out.println(i);
            }
            i = i + 1;*/
   public static void main(String[] args) {

      double salario = 1200;
      double porcentagem = 0.15;
      double calculo = salario * porcentagem;
      double somaDeSalarioMaisPorcentagem = salario + calculo;
      System.out.println( "O  valor do salario e de : " + salario);
      System.out.println( "O  valor do salario mais a porcentagem e de : " + somaDeSalarioMaisPorcentagem);


   }

}










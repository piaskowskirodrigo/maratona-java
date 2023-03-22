package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String menssagemDoar = "Eu vou doar 500";
        String menssagemNaoDoar = "Eu nao vou doar";
        String resultado;
        if (salario > 5000){
            resultado = menssagemDoar;
        } else {
            resultado = menssagemNaoDoar;
        }
        System.out.println(resultado);
    }
}

package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 10;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade <18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}

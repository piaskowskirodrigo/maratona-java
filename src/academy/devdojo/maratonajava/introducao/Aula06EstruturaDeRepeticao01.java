package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        //WHILE, DO WHILE, FOR
        //COMPARAÇÃO--COOLEAN
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count = count + 1;
            //cout =+ 1;
            //sout(++count)
        }
        count = 0;
        do {
            System.out.println("Dentro do while" + ++count);

        }while (count < 10);
        count = 0;
        for (count=0; count <10; count++);
        System.out.println("for " +count);


    }
}

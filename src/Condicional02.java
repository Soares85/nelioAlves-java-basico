import java.util.Scanner;

public class Condicional02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " É PAR");
        } else {
            System.out.println(num + " É ÍMPAR");
        }
    }
}
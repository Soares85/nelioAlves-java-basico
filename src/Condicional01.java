import java.util.Scanner;

public class Condicional01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = in.nextInt();

        if(num > 0){
            System.out.println(num + " não é negativo");
        } else {
            System.out.println(num + " é negativo");
        }
    }
}
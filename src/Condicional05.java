import java.util.Scanner;

public class Condicional05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int codigo, quantidade;
        double total = 0;

        System.out.println("Informe o código: ");
        codigo = in.nextInt();

        System.out.println("Informe a quantidade: ");
        quantidade = in.nextInt();

        if(codigo == 1){
            total = 4 * quantidade;
        } else if (codigo == 2) {
            total = 4.50 * quantidade;
        } else if (codigo == 3) {
            total = 5 * quantidade;
        } else if (codigo == 4) {
            total = 2 * quantidade;
        } else if (codigo == 5) {
            total = 1.50 * quantidade;
        } else {
            System.out.println("Código incorreto");
        }

        System.out.printf("Total: R$ %.2f", total);

    }
}
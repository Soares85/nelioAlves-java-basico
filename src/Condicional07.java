import java.util.Scanner;

public class Condicional07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double x = in.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double y = in.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x > 0 && y > 0) {
            System.out.println("Q2");
        } else if (x > 0 && y > 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if(x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        }
    }
}
import java.util.Scanner;

public class Condicional04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inicio, fim, duracao;

        System.out.println("Digite a hora inicial: ");
        inicio = in.nextInt();

        System.out.println("Digite a hora final: ");
        fim = in.nextInt();


        if( inicio >= fim){
            duracao = (24 + fim) - inicio;
        } else {
            duracao = fim - inicio;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
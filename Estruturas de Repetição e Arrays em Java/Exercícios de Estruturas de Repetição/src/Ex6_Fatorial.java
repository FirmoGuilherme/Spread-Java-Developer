import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplicacao = 1;
        System.out.println("Escreva o numero para calcular o fatorial");
        int numero = scanner.nextInt();


        for (int i = numero; i  >= 1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println("!" + numero + " = " + multiplicacao);
    }
}

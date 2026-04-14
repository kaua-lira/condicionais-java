import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número é: " + resultado);

        scanner.close();
    }
}
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Os três números são iguais.");
        } else if (a >= b && a >= c) {
            if (a == b || a == c) {
                System.out.println("Empate no maior valor: " + a);
            } else {
                System.out.println("Maior número: " + a);
            }
        } else if (b >= a && b >= c) {
            if (b == a || b == c) {
                System.out.println("Empate no maior valor: " + b);
            } else {
                System.out.println("Maior número: " + b);
            }
        } else {
            if (c == a || c == b) {
                System.out.println("Empate no maior valor: " + c);
            } else {
                System.out.println("Maior número: " + c);
            }
        }

        scanner.close();
    }
}
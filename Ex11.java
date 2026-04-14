import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        double valor;

        if (idade < 12) {
            valor = 10.00;
        } else if (idade <= 60) {
            valor = 20.00;
        } else {
            valor = 10.00;
        }

        System.out.println("Valor do ingresso: R$ " + valor);

        scanner.close();
    }
}
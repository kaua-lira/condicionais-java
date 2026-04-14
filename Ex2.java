import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        int n1 = leia.nextInt();

        System.out.println("Informe o segundo numero");
        int n2 = leia.nextInt();

        String finalString = (n1 > n2)
                ? "o numero " + n1 + " é maior"
                : "o numero " + n2 + " é o maior";

        System.out.println(finalString);
        leia.close();
    }
}

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        double desconto = (valor > 500) ? 0.20 :
                          (valor >= 200) ? 0.10 : 0.0;

        double valorFinal = valor - (valor * desconto);

        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }
}
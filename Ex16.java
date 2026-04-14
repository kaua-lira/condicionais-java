import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        String resultado = (n % 3 == 0 && n % 5 == 0) ? "Múltiplo de 3 e de 5" :
                           (n % 3 == 0) ? "Múltiplo apenas de 3" :
                           (n % 5 == 0) ? "Múltiplo apenas de 5" :
                           "Não é múltiplo de 3 nem de 5";

        System.out.println(resultado);

        sc.close();
    }
}
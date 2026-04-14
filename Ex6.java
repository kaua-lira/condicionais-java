import java.util.Scanner;

public class Ex6 {

        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    
        System.out.println("Digite o ano :");
        int ano = leia.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

        leia.close();

    }    
}

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua nota: ");
        int n = scanner.nextInt();

        if (n <= 4) {
            System.out.println("Sua nota é D");
        } else if (n <=6) {
            System.out.println("Sua nota é C");
        }else if (n <=8) {
              System.out.println("Sua nota é B");
        }else if (n <= 10) {
            System.out.println("Sua nota é A");
        }else {
            System.out.println("Nota inválida");
            scanner.close();
            return;
        }
           


        scanner.close();
    }

    
}
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double lado3 = sc.nextDouble();

        
        if (lado1 + lado2 > lado3 &&lado1 + lado3 > lado2 &&lado2 + lado3 > lado1) {

            
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        sc.close();
    }
}
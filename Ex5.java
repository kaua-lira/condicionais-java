import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("informe o preimeiro numero");
        double n1 = leia.nextDouble();

        System.out.println("informe o preimeiro numero");
        double n2 = leia.nextDouble();

            System.out.println("escolha ma operação (+,-,*,/):");
            char op = leia.next().charAt(0);

            double resultado;

        switch (op) {
            case '+':
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Operação inválida!");
        }

        leia.close();
    }




        
}
    


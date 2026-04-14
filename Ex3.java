import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("informe a nota");
        int n = leia.nextInt();

        String finalString = (n >= 7) 
                ? "o aluno esta aprovaso" 
                : (n >= 5 && n < 7) 
                    ? "o aluno esta em recuperacao" 
                    : "o aluno esta reprovado";

        System.out.println(finalString);
        leia.close();
    }
}
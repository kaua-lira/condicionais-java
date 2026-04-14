
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("informe a temperatura");
        int g  = leia.nextInt();

        String finalString = (g < 15) 
                ? "esta frio" 
                : (g >= 15 && g < 25) 
                    ? "a temperatura esta agradavel" 
                    : "a temperarura esta quente";

        System.out.println(finalString);
        leia.close();

    }
}

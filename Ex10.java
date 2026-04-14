import java.util.Scanner;

public class Ex10{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

    System.out.println("informe um numero :");
        int n = leia.nextInt();

        String resultado = (n == 0)
        ?"o numero é zero"
        :(n > 0)
        ?"o numero "+n+" é positivo"
        :"o numero "+n+" é negativo";

        System.out.println(resultado);
        leia.close();
}

}
//Leia um número e informe se é positivo, negativo ou zero. 
// Obrigatório: use o operador ternário aninhado.
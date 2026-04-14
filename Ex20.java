import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jogador 1, escolha (pedra, papel ou tesoura): ");
        String jogador1 = sc.next().toLowerCase();

        System.out.print("Jogador 2, escolha (pedra, papel ou tesoura): ");
        String jogador2 = sc.next().toLowerCase();

        String resultado = "";

        if (jogador1.equals(jogador2)) {
            resultado = "Empate";
        } else if ((jogador1.equals("pedra") && jogador2.equals("tesoura")) || 
                   (jogador1.equals("tesoura") && jogador2.equals("papel")) || 
                   (jogador1.equals("papel") && jogador2.equals("pedra"))) {
            resultado = "Jogador 1 venceu";
        } else {
            resultado = "Jogador 2 venceu";
        }

        System.out.println(resultado);

        sc.close();
    }
}


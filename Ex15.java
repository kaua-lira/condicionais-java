import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        
        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Operador ternário
        String resultado = (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta))
                ? "Acesso permitido"
                : "Acesso negado";

        System.out.println(resultado);

        scanner.close();
    }
}
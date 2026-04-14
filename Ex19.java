import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite a velocidade do veículo (km/h): ");
        double velocidade = sc.nextDouble();

        System.out.print("Digite o limite de velocidade da via (km/h): ");
        double limite = sc.nextDouble();

        
        double excesso = velocidade - limite;

        
        String classificacao = (excesso <= 0) ? "Sem multa" :
                               (excesso <= 0.2 * limite) ? "Multa leve" :
                               (excesso <= 0.5 * limite) ? "Multa grave" :
                               "Multa gravíssima + suspensão";

        
        System.out.println(classificacao);

        sc.close();
    }
}
//Leia a velocidade de um veículo e o limite da via. Classifique:
//Dentro do limite → "Sem multa"
//Até 20% acima → "Multa leve"
//Entre 20% e 50% acima → "Multa grave"
//Acima de 50% → "Multa gravíssima + suspensão"

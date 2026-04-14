import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    
     System.out.println("informe um numero de 1 a 7 :");
        int n = leia.nextInt();

        int dia = n ;

    switch (dia) {
    case 1:
        System.out.println("Segunda-feira");
        break;
    case 2:
        System.out.println("Terça-feira");
        break;
    case 3:
        System.out.println("Quarta-feira");
        break;
    case 4:
        System.out.println("Quinta-feira");
        break;
    case 5:
        System.out.println("Sexta-feira");
        break;
    case 6:
        System.out.println("Sabado");
        break;
    case 7:
        System.out.println("domingo");
        break;
    default:
        System.out.println("Dia invalido");
}


    }
}


//Leia um número de 1 a 7 e exiba o nome do dia da semana correspondente usando switch. 
// Para qualquer outro número, exiba "Dia inválido".

import java.util.Scanner;

public class Exercicio2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numero = input.nextInt();

            if (numero > 0) {
                System.out.println("O número é positivo.");
            } else if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }

        }
    }



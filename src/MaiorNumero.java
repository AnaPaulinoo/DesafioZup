import java.util.Scanner;

    public class MaiorNumero {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = input.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = input.nextInt();

            if (numero1 > numero2) {
                System.out.println(numero1 + " é o maior número.");
            } else if (numero2 > numero1) {
                System.out.println(numero2 + " é o maior número.");
            } else {
                System.out.println("Os números são iguais.");
            }

            input.close();
        }
    }



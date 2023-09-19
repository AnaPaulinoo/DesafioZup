import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inteiro para calcular o fatorial: ");
        int N = input.nextInt();

        int fatorial = 1; // Inicializa o fatorial como 1 (N! de 0 é 1)

        if (N < 0) {
            System.out.println("O fatorial de números negativos não é definido.");
        } else {
            for (int i = 1; i <= N; i++) {
                fatorial *= i;

                // Verifica o estouro do limite do int
                if (fatorial < 0) {
                    System.out.println("O fatorial excedeu o limite de um int.");
                    break; // Interrompe o cálculo
                }
            }
            System.out.println(N + "! = " + fatorial);
        }

        input.close();
    }
}




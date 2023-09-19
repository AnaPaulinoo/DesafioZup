import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VerificarNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota (entre 0 e 10): ");
        double nota = input.nextDouble();

        if (nota >= 8) {
            System.out.println("Aprovado.");
        } else if (nota >= 6 && nota < 8) {
            System.out.println("Em recuperação.");
        } else if (nota < 6 && nota >= 0) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
        }

    }
}



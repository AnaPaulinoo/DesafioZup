import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarLista {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();

        System.out.print("Digite uma lista de números (digite -1 para encerrar): ");

        int numero = input.nextInt();

        while (numero != -1) {
            lista.add(numero);
            numero = input.nextInt();
        }

        Collections.sort(lista, Collections.reverseOrder());

        System.out.println("Lista ordenada em ordem decrescente:");
        for (int i : lista) {
            System.out.print(i + " ");
        }

    }
}

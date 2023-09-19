import java.util.Scanner;

public class exercicio3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite uma letra: ");
            char letra = input.next().charAt(0);

            letra = Character.toLowerCase(letra);

            if (letra >= 'a' && letra <= 'z') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("A letra é uma vogal.");
                } else {
                    System.out.println("A letra é uma consoante.");
                }
            } else {
                System.out.println("Por favor, insira uma letra válida.");
            }

        }
    }



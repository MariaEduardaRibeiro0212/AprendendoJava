import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota 1: ");
        float n1 = scanner.nextFloat();

        System.out.println("Nota 2: ");
        float n2 = scanner.nextFloat();

        System.out.println("Nota 3: ");
        float n3 = scanner.nextFloat();

        System.out.println("Nota 4: ");
        float n4 = scanner.nextFloat();

        float media = (n1 + n2 + n3 + n4)/4;

        System.out.println("Média: " + media);

    }



}

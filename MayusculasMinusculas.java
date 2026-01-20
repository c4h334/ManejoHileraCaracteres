import java.util.Scanner;

public class MayusculasMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una frase");
        String frase = scanner.nextLine();

        System.out.printf("Frase en mayúsculas: %s%nFrase en minúsculas: %s%n", frase.toUpperCase(),
                frase.toLowerCase());
    }
}

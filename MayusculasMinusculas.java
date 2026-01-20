import java.util.Scanner;

public class MayusculasMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una frase");
        String frase = scanner.nextLine();

        System.out.println("Frase original: " + frase + "\nFrase en mayúsculas: " + frase.toUpperCase()
                + "\nFrase en minúsculas: " + frase.toLowerCase());
    }
}

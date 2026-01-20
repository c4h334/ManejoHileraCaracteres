import java.util.Scanner;

public class InversionHilera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una palabra");
        String palabra = scanner.nextLine();
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        System.out.println("La palabra invertida es " + invertida);
    }
}

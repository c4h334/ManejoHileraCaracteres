import java.util.Scanner;

public class BusquedaHilera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una frase");
        String frase = scanner.nextLine();

        System.out.println("Escriba una palabra");
        String palabra = scanner.nextLine();

        System.out.println((frase.contains(palabra)) ? "La palabra " + palabra + " está en la frase"
                : "La palabra " + palabra + " no está en la frase");
    }
}

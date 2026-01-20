
import java.util.Scanner;

public class LongitudHilera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una hilera de caracteres");
        String hilera = scanner.nextLine();
        System.out.println("El tamaño de la hilera es de " + hilera.length());
    }
}

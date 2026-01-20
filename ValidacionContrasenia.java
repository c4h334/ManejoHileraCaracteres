
import java.util.Scanner;

public class ValidacionContrasenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una contraseña");
        String contrasenia = scanner.nextLine();

        System.out.println((contrasenia.length() >= 8 && !contrasenia.equals(contrasenia.toLowerCase())) ? "La contraseña es válida"
                : "La contraseña no es válida");
    }
}
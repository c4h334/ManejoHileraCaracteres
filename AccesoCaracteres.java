import java.util.Scanner;

public class AccesoCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una palabra");
        String palabra = scanner.nextLine();
        System.out.println("El primer carácter de la palabra " + palabra + " es '" + palabra.charAt(0) + "'"
                + " y el último es '" + palabra.charAt(palabra.length() - 1) + "'");
    }
}

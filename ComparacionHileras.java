import java.util.Scanner;

public class ComparacionHileras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba la primera hilera de caracteres");
        String hilera1 = scanner.nextLine();

        System.out.println("Escriba la segunda hilera de caracteres");
        String hilera2 = scanner.nextLine();

        System.out.println((hilera1.equalsIgnoreCase(hilera2)) ? "Ambas hileras son idénticas"
                : "Las hileras son diferentes");
    }
}

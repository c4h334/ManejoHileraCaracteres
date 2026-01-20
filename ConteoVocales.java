import java.util.Scanner;

public class ConteoVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una hilera de caracteres");
        String hilera = scanner.nextLine();

        int vocales = 0;
        for (int i = 0; i < hilera.length(); i++) {
            if (hilera.charAt(i) == 'a' || hilera.charAt(i) == 'e' || hilera.charAt(i) == 'i'
                    || hilera.charAt(i) == 'o' || hilera.charAt(i) == 'u') {
                vocales++;
            }
        }

        System.out.println("La hilera tiene " + vocales + " vocales");

    }
}

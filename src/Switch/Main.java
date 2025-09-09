package Switch;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero - preferibilmente tra 0 e 3:");
        int n = parseInt(scanner.nextLine());
        System.out.println("Vediamo se riusciamo a convertire il tuo numero in lettere: " + writeNumber(n));
    };

    public static String writeNumber(int n) {
        return switch (n) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> "Mi dispiace, il tuo numero non è compreso tra 0 e 3.";
        };
    }
}

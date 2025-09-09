package For;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digita un numero da cui far partire il conto alla rovescia!");
        int n = parseInt(s.nextLine());
        contoAllaRovescia(n);
    }

    public static void contoAllaRovescia(int n) {
        for (int i = n-1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}


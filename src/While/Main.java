package While;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci una stringa da dividere in lettere. Per concludere, digita ':q'");
            String string = s.nextLine();
            if (string.equals(":q")) break;
            System.out.println(obtainChars(string));
        }
        s.close();

    }

    public static String obtainChars(String s) {
        String[] arr = s.split("");
        String sArr = Arrays.toString(arr);
        sArr = sArr.substring(1, sArr.length() - 1);
        return sArr;
    }
}

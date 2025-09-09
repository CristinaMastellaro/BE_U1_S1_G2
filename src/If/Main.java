package If;

public class Main {
    public static void main(String[] args) {
        System.out.println("La stringa 'hell' è pari? " + stringaPariDispari("hell"));
        System.out.println("L'anno 1800 è bisestile? " + annoBisestile(1800));
    };

    public static boolean stringaPariDispari(String s) {
      return s.length() % 2 == 0;
    };

    public static boolean annoBisestile (int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 ) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}



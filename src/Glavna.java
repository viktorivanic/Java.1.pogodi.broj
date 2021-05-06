
import java.util.Random;
import java.util.Scanner;

public class Glavna {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dobrodošli u igru pogađanja");
        System.out.println("Zadatak je pogoditi dvoznamenkasti broj" +
                "\nB znači da je znamenka u broju pogođena te da je na pravom mjestu" +
                "\nC znači da je znamenka u broju ppogođena, ali se nalazi na krivom mjestu");
        Random random = new Random();
        int intRandom = random.nextInt(99);//66---100

        while (intRandom < 11) {
            intRandom++;
        }
        String s = String.valueOf(intRandom);
        char charRandom1 = s.charAt(0);
        char charRandom2 = s.charAt(1);
        while (true) {

            if (charRandom1 == charRandom2) {
                charRandom1++;
            }
            System.out.println("Upišite broj");
            String strRandom = scanner.nextLine();

            int input = Integer.parseInt(strRandom);
            if (input < 10) {
                System.out.println("Broj treba biti dvoznamenkasti!");
                continue;
            }
            char charInput = strRandom.charAt(0);
            char charInput2 = strRandom.charAt(1);

            if (input == intRandom) {
                System.out.println("Bravo!");
                return;
            } else if (charRandom1 == charInput || charRandom2 == charInput2) {
                System.out.println("1B,OC");
            } else if (charRandom1 == charInput2 && charRandom2 == charInput) {

                System.out.println("0B,2C");
            } else if (charRandom1 == charInput2 || charRandom2 == charInput) {
                System.out.println("0B,1C");
            } else {
                System.out.println("0B,0C");
            }
        }
    }
}
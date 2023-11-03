import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        menuMethod();

    }


    public static void myMethod() {
        System.out.print("""
                +---------------------------------+
                |  off                      on    |
                |                                 |
                |   <- back  (menu)   next->      |
                |       1      2     3      4     |
                |       5      6     7      8     |
                |                                 |
                +---------------------------------+

                                     """);
    }

    public static void menuMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Turn on TV:");
        String word = scanner.nextLine();
        if (word.equals("on")) {
            System.out.print("""
                    +---------------------------------+
                    |  off                      on    |
                    |                                 |
                    |   <- back  (menu)   next->      |
                    |       1      2     3      4     |
                    |       5      6     7      8     |
                    |                                 |
                    +---------------------------------+

                                         """);


        } else {
            System.out.println("Tuura emes KNOPKA BASYLDY, kaira bas:");
        }
        String knopka = scanner.nextLine();

        while (knopka.equals("on")) {
            myMethod();
            System.out.println("Pulttan emi tanda:");
            if (knopka.equals("off")) {
                System.out.println("TV is turn off,please turn on: ");
            }
            String knopka1 = scanner.nextLine();
            if (knopka1.equals("on")) {
                myMethod();
            } else {
                System.out.println("Tuura emes baskych");

            }
        }

    }
}
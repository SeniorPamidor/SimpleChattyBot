import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();

        if (userNumber > -15 && userNumber <= 12) {
            System.out.println("True");
        } else if (userNumber > 14 && userNumber < 17) {
            System.out.println("True");
        } else if (userNumber >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
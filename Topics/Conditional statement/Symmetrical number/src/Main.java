import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();

        int firstDigit = userNumber / 1000;
        int secondDigit = userNumber / 100 % 10;
        int thirdDigit = userNumber / 10 % 10;
        int fourthDigit = userNumber % 10;

        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(222);
        }

    }
}
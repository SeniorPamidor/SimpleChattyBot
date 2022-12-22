import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean onePositive = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean twoPositive = num2 > 0 && num1 <= 0 && num3 <= 0;
        boolean threePositive = num3 > 0 && num2 <= 0 && num1 <= 0;

        System.out.println(onePositive || twoPositive || threePositive);

    }
}
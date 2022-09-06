import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        final int on = 10;
        final int b = a / on;

        final int c = b % on;

        System.out.println(c);
    }
}
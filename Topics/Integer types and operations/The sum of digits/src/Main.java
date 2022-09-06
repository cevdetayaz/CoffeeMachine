import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        final int numberTen = 10;
        final int numberHundred = 100;
        final int b = a / numberHundred;
        final int c = a % numberHundred;
        final int d = c / numberTen;
        final int e = c % numberTen;

        System.out.println(b + d + e);
    }
}
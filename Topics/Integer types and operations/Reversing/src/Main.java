import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi =  scanner.nextInt();
        final int ten = 10;
        final int hundred = 100;

        final int a = sayi / hundred;
        final int b = sayi % hundred;

        final int c = b / ten;
        final int d = b % ten;

        System.out.print(d * hundred + c * ten + a);

    }
}
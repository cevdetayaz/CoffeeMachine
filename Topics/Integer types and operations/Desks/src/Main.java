import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        final int grup1Kalan = a % 2;
        final int grup1Masa = (a + grup1Kalan) / 2;
        final int grup2Kalan = b % 2;
        final int grup2Masa = (b + grup2Kalan) / 2;
        final int grup3Kalan = c % 2;
        final int grup3Masa = (c + grup3Kalan) / 2;

        System.out.println(grup1Masa + grup2Masa + grup3Masa);
    }
}
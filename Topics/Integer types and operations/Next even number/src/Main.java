import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int sayi = scanner.nextInt();
        final int even = 2;

        final int kalan = sayi % even;

        System.out.println(sayi - kalan + even);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        int toplam = 0;

        for (int i = a; i <= b; i++) {
            toplam += i;
        }
        System.out.println(toplam);
    }
}
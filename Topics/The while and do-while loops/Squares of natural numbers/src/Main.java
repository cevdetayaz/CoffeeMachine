import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sayi = scanner.nextInt();
        int kok = (int) Math.sqrt(sayi);
        for (int i = 1; i <= kok; i++) {
            System.out.println(i * i);
        }
    }
}
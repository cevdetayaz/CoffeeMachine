import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word = scanner.nextLine();
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println(word.substring(sayi1, sayi2 + 1));
    }
}
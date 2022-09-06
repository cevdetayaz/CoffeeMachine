import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int h = scanner.nextInt();

        if (h >= a && b >= h) {
            System.out.println("Normal");
        } else if (h < a) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}
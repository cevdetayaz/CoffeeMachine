import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int dortYuz = 400;
        final int yuz = 100;
        final int dort = 4;
        final int sifir = 0;
        int year = scanner.nextInt();

        if (year % dortYuz == sifir) {
            System.out.println("Leap");
        } else if (year % yuz == sifir) {
            System.out.println("Regular");
        } else if (year % dort == sifir) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}
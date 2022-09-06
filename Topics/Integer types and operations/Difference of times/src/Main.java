import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        final int hourToSeconds = 3600;
        final int minuteToSeconds = 60;

        final int secondTime = d * hourToSeconds + e * minuteToSeconds + f;
        final int firstTime = a * hourToSeconds + b * minuteToSeconds + c;

        System.out.println(secondTime - firstTime);

    }
}
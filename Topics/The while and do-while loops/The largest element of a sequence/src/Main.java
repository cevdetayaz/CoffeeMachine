import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = -1;
        int value = -1;

        do {

            if (scanner.hasNextInt()) {
                max = scanner.nextInt();
                if (max > value) {
                    value = max;
                }
            }

        } while (max != 0);

        System.out.println(value);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (k > n * m || (k < n || k < m)) {
            System.out.println("NO");
        }
        else if (k < n * m) {
            if (n * m % k == 5) {
                System.out.println("deneme");
            }
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = -1;
        int sayac = scanner.nextInt();
        final int four = 4;

        for (int i = 0; i < sayac; i++) {
            int sayi = scanner.nextInt();
            if (sayi > max && sayi % four == 0) {
                max = sayi;
            }
        }

        System.out.println(max);

        
    }
}

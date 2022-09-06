import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sayi = scanner.nextInt();
        boolean durum = true;
        int count = 0;
        for (int i = 1; i <= sayi; i++) {
            count++;
            for (int j = i; 0 < count && durum != false  ; j++) {
                System.out.println(i);
                count++;
            }
            if ( sayi == count) {
                break;
            }
        }
    }
}
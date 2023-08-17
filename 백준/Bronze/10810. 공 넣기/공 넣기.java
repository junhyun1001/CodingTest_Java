import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int l = 0; l < m; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int x = i; x <= j; x++) {
                arr[x - 1] = k;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
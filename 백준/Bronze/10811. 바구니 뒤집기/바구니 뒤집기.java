import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            reverse(arr, a, b);
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void reverse(int[] arr, int a, int b) {
        int reverseCnt = (b - a + 1) / 2;
        for (int i = 0; i < reverseCnt; i++) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
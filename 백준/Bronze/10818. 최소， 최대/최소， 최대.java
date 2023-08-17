import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(min + " " + max);
    }
}
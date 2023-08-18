import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);

        float avg = 0f;

        for (float x : arr) {
            avg += x / max * 100;
        }

        System.out.println(avg / arr.length);
    }
}
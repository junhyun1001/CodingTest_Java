import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().orElseThrow();
        int index = IntStream.range(0, arr.length).filter(i -> arr[i] == max).findFirst().orElse(-1);

        System.out.println(max);
        System.out.println(index + 1);

    }
}
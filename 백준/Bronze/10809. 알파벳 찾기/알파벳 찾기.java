import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i) - 97;
            if(arr[c] == -1)
                arr[c] = i;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
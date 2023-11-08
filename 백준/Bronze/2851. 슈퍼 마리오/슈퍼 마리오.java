import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int answer = arr[0];
        for (int i = 1; i < 10; i++) {
            arr[i] += arr[i - 1];

            if (arr[i] > 100) {
                int abs1 = Math.abs(arr[i] - 100);
                int abs2 = Math.abs(arr[i - 1] - 100);
                if (abs1 > abs2) {
                    answer = arr[i - 1];
                } else {
                    answer = arr[i];
                }
                break;
            } else if (arr[i] < 100){
                answer = arr[i];
            }

        }

        System.out.println(answer);


    }
}

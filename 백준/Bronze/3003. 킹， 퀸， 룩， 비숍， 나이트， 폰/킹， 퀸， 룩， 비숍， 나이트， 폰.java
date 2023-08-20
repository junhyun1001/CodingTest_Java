import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int[] chess = {1, 1, 2, 2, 2, 8};

        int[] intArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < chess.length; i++) {
            System.out.print((chess[i] - intArr[i]) + " ");
        }

    }

}
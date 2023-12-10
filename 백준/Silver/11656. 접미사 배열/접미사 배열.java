import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] answer = new String[input.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = input.substring(i);
        }

        Arrays.sort(answer);

        for(String s : answer) {
            System.out.println(s);
        }

    }
}

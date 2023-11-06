import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            int start = 0;
            for (int j = i; j < input.length(); j++) {
                set.add(input.substring(start, j + 1));
                start++;
            }
        }

        System.out.println(set.size());

    }
}

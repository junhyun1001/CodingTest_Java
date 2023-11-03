import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < line.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(line.charAt(i))));
        }

        list.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i : list) {
            sb.append(i);
        }

        System.out.println(sb);

    }
}

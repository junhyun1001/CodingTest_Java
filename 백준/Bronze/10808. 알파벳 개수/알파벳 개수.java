import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int[] answer = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            answer[c - 'a']++;
        }

        for(int i: answer) {
            System.out.print(i + " ");
        }

    }
}

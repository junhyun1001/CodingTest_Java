import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);


    }

    public static boolean isGroupWord(String word) {
        Set<Character> usedChars = new HashSet<>();
        char prevChar = ' ';
        for (char currentChar : word.toCharArray()) {
            // 이전에 나왔던 단어이고 이전 문자와 다르면 false
            if (usedChars.contains(currentChar) && prevChar != currentChar) {
                return false;
            }
            usedChars.add(currentChar);
            prevChar = currentChar;
        }
        return true;
    }
}
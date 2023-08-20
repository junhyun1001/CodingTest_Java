import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        String input = br.readLine();
        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'C') {
                answer += 3;
            } else if (c >= 'D' && c <= 'F') {
                answer += 4;
            } else if (c >= 'G' && c <= 'I') {
                answer += 5;
            } else if (c >= 'J' && c <= 'L') {
                answer += 6;
            } else if (c >= 'M' && c <= 'O') {
                answer += 7;
            } else if (c >= 'P' && c <= 'S') {
                answer += 8;
            } else if (c >= 'T' && c <= 'V') {
                answer += 9;
            } else if (c >= 'W' && c <= 'Z') {
                answer += 10;
            }
        }

        System.out.println(answer);

    }

}

/*
        해당 알파벳에 각각 초를 부여
        ex) W = 10초
            A = 3초
 */
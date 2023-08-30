import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());

        int n = input / 2 + input % 2; // 입력 받은 값의 반 이후는 검사 할 필요 없음
        int start = 1;
        int end = 1;
        int sum = 0;
        int count = 1; // 입력 받은 값 하나를 바로 카운트 해놓음

        while (end != n) {
            sum += start;
            start++;
            
            // 변수 초기화
            if (sum >= input) {
                if (sum == input) {
                    count++;
                }
                end++; // sum 구할 때 start를 하나씩 늘림
                start = end;
                sum = 0;
            }
        }
        System.out.println(count);
    }
}
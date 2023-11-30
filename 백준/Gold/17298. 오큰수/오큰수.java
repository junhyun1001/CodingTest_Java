import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {

            // 스택에 넣어놨던 인덱스 값 보다 현재 비교하는 수가 더 클 때, 즉 오큰수일 때 arr[i] 값을 stack에서 꺼낸 인덱스의 값으로 바꿈
            while (!stack.empty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }

            stack.push(i);

        }

        // 모든 루프가 끝난 후 스택에 남아있는 요소들은 오큰수가 없는 수 이므로 -1로 값을 바꿈
        while (!stack.empty()) {
            arr[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);

    }
}

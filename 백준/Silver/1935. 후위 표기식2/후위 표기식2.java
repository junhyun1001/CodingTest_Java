import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Object> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        String postfixExp = br.readLine();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < postfixExp.length(); i++) {
            char c = postfixExp.charAt(i);
            if (65 <= c && c <= 90) {
                stack.push(arr[c - 65]);
            } else if (!stack.empty()) {
                double b = (double) stack.pop();
                double a = (double) stack.pop();

                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }

            }
        }

        double answer = (double) stack.pop();

        System.out.printf("%.2f", answer);
    }
}

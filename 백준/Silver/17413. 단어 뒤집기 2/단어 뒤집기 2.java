import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        char[] input = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < input.length; i++) {
            if(input[i] == '<') {
                while(input[i] != '>') {
                    sb.append(input[i++]);
                }
                sb.append('>');
            } else if(input[i] == ' ') {
                sb.append(' ');
            } else {
                while(i < input.length && input[i] != ' ' && input[i] != '<') {
                    stack.push(input[i++]);
                }
                while(!stack.empty()) {
                    sb.append(stack.pop());
                }
                i--;
            }

        }

        System.out.println(sb);


    }
}

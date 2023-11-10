 import java.io.*;
 import java.util.*;

 public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int n = Integer.parseInt(br.readLine());

         Stack<Integer> stack = new Stack<>();

         StringBuilder sb = new StringBuilder();
         String s = "";
         int x = 0;
         for(int i = 0; i < n; i++) {
             StringTokenizer st = new StringTokenizer(br.readLine());

             if(st.countTokens() == 2) {
                 s = st.nextToken();
                 x = Integer.parseInt(st.nextToken());
             } else {
                 s = st.nextToken();
             }

             switch (s) {
                 case "push":
                     stack.push(x);
                     break;
                 case "pop":
                     if(!stack.empty()) {
                         sb.append(stack.pop()).append("\n");
                     } else {
                         sb.append(-1).append("\n");
                     }
                     break;
                 case "size":
                     sb.append(stack.size()).append("\n");
                     break;
                 case "empty":
                     if(!stack.empty()) {
                         sb.append(0).append("\n");
                     } else {
                         sb.append(1).append("\n");
                     }
                     break;
                 case "top":
                     if(!stack.empty()) {
                         sb.append(stack.peek()).append("\n");
                     } else {
                         sb.append(-1).append("\n");
                     }
                     break;
             }

         }

         System.out.println(sb);

     }
 }

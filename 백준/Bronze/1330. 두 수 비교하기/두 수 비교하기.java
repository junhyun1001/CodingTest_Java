import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] split = input.split(" ");

        int[] intArr = new int[split.length];
        int i = 0;
        for (String s : split) {
            intArr[i++] = Integer.parseInt(s);
        }
        if (intArr[0] > intArr[1]) {
           bw.write(">");
           bw.flush();
        } else if (intArr[0] < intArr[1]) {
            bw.write("<");
            bw.flush();
        } else {
            bw.write("==");
            bw.flush();
        }
    }
}
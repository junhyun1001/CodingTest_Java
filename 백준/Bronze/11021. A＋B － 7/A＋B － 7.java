import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");
            bw.write("Case #" + (i + 1) + ": " + (Integer.parseInt(split[0]) + Integer.parseInt(split[1])) + "");
            bw.newLine();
        }
        bw.flush();
    }
}
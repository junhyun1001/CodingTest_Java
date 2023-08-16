import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");
            sb.append("Case #");
            sb.append(i + 1);
            sb.append(": ");
            sb.append(split[0]);
            sb.append(" + ");
            sb.append(split[1]);
            sb.append(" = ");
            sb.append(Integer.parseInt(split[0]) + Integer.parseInt(split[1]));
            bw.write(String.valueOf(sb));
            bw.newLine();
            sb.delete(0, sb.length());
        }
        bw.flush();
    }
}
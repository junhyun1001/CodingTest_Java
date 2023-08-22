import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = Integer.parseInt(s.substring(0, 1));
        int b = Integer.parseInt(s.substring(2,3));
        System.out.println(a + b);

    }
}
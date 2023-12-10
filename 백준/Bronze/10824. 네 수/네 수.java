import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] arr = input.split(" ");

        long ab = Long.parseLong(arr[0] + arr[1]);
        long cd = Long.parseLong(arr[2] + arr[3]);

        System.out.println(ab + cd);

    }
}

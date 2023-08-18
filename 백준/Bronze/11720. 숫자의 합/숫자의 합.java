import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] chars = sc.next().toCharArray();

        int sum = 0;
        for (char c : chars) {
            sum += Integer.parseInt(Character.toString(c));
        }
        System.out.println(sum);
    }
}
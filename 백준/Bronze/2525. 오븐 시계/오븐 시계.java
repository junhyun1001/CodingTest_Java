import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        if (m + time >= 60) {
            h += (m + time) / 60;
            m = (m + time) % 60;

            if (h >= 24) {
                h -= 24;
            }
            System.out.println(h + " " + m);
        } else System.out.println(h + " " + (m + time));
    }
}
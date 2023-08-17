import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> submitted = new HashSet<>();
        for (int i = 0; i < 28; i++) {
            submitted.add(sc.nextInt());
        }

        for (int i = 1; i <= 30; i++) {
            if (!submitted.contains(i)) {
                System.out.println(i);
            }
        }

    }
}
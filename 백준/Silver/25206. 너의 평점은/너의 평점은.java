import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = 0.0; // 전공과목별(학점 x 과목평점)의 합
        double b = 0.0; // 학점의 총합
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            if (input[2].equals("P")) {
                b += 0.0;
            } else b += Double.parseDouble(input[1]);
            a += Double.parseDouble(input[1]) * grade(input[2]);

        }

        System.out.printf("%f", a / b);

    }

    public static double grade(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0.0;
        }
    }


}
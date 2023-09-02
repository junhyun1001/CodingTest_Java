import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] maxArr = new int[9];
        String[] point = new String[9];
        int idx = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int findMax = Integer.parseInt(st.nextToken());
                if (max < findMax) {
                    max = findMax;
                    maxArr[i] = max;
                    point[idx] = (i + 1) + " " + (j + 1);
                }
            }
            max = Integer.MIN_VALUE;
            idx++;
        }
        
        int maxIdx = 0;
        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] > max) {
                max = maxArr[i];
                maxIdx = i;
            }
        }

        System.out.println(maxArr[maxIdx]);
        System.out.println(point[maxIdx]);
    }
}

/*
    한 줄 마다 max 값을 찾고 for문이 도는 횟수를 행, maxArr[]의 인덱스 위치를 행으로 저장
 */

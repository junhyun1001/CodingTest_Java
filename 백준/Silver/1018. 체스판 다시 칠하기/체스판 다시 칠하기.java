import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static char[][] whiteBoard;
    public static char[][] blackBoard;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로

        initBoard();

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {

                int wTemp = 0;
                int bTemp = 0;

                for (int a = i; a < 8 + i; a++) {
                    for (int b = j; b < 8 + j; b++) {
                        char boardChar = board[a][b];
                        char whiteChar = whiteBoard[a - i][b - j];
                        char blackChar = blackBoard[a - i][b - j];
                        if (boardChar != whiteChar) {
                            wTemp++;
                        } else if (boardChar != blackChar) {
                            bTemp++;
                        }
                    }
                }

                int min = Math.min(wTemp, bTemp);
                if (answer > min) {
                    answer = min;
                }

            }
        }

        System.out.println(answer);

    }

    public static void initBoard() {
        whiteBoard = new char[8][8];
        blackBoard = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    whiteBoard[i][j] = 'W';
                    blackBoard[i][j] = 'B';
                    if (j % 2 != 0) {
                        whiteBoard[i][j] = 'B';
                        blackBoard[i][j] = 'W';
                    }
                } else {
                    whiteBoard[i][j] = 'W';
                    blackBoard[i][j] = 'B';
                    if (j % 2 == 0) {
                        whiteBoard[i][j] = 'B';
                        blackBoard[i][j] = 'W';
                    }
                }
            }
        }
    }

}
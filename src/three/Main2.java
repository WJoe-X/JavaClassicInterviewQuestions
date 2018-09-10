package three;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:13 2018/8/27
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[][] nn = new int[n][n];
        int[][] QQ= new int[2][Q];
        for (int i = 0; i <Q ; i++) {
            QQ[0][i] = sc.nextInt()-1;
            QQ[1][i] =sc.nextInt()-1;
        }

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++) {
                if (i == j) {
                    nn[i][j] = 1;
                    map.put(times[j], 1);
                }
                else if (!map.containsKey(times[j])) {
                    map.put(times[j], 1);
                    nn[i][j] = nn[i][j - 1] + 1;
                } else nn[i][j] = nn[i][j - 1];
            }
        }
        for (int i = 0; i <Q ; i++) {
            int first = QQ[0][i];
            int second = QQ[1][i];
            System.out.println(nn[first][second]);
        }



    }
}

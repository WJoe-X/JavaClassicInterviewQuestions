package ST;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:52 2018/9/7
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ints = new int[2][n];
        int max = Integer.MIN_VALUE;
        int maxindex = 0;
        for (int i = 0; i < n; i++) {
            ints[0][i] = scanner.nextInt();
            ints[1][i] = scanner.nextInt();
            if (ints[0][i] > max) {
                max = ints[0][i];
                maxindex = i;
            }
        }
        System.out.println(max);
    }
}

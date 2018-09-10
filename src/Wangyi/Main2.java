package Wangyi;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 15:56 2018/9/8
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ints = new int[2][n];
        for (int i = 0; i < n; i++) {
            ints[0][i] = sc.nextInt();
            ints[1][i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(0 + " ");
            System.out.print(get(ints[0][i], ints[1][i]));
            System.out.println();
        }
    }

    private static int get(int n, int k) {
        if (k <= 1)
            return 0;
        if (n <= k)
            return 0;
        if (n % 2 == 1) {
            if (2 * k + 1 <= n)
                return k;
            else return n / 2 - (k - (n + 1) / 2);
        }else {
            if ( 2 * k <= n)
                return k-1;
            else return (n - 1) / 2 - (k - n / 2)+1;
        }
    }
}

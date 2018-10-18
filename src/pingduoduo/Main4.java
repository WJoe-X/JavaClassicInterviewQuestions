package pingduoduo;

import java.util.Random;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 16:33 2018/9/21
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int A = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(getP(M, A, R));

    }
    private static String getP(int M, int A, int R) {
        if (M <= 0)
            return "0.00000";
        int sum = 10000;
        int count = 0;
        Random rand = new Random();
        for (int i = 0; i < sum; i++) {
            int bunes = 0;
            while (bunes < A) {
                int b = rand.nextInt(R) + 1;
                bunes += b;
            }
            if (bunes <= M)
                count++;
        }
        double d= (double)count/sum;
        String result = String.format("%.5f", d);
        return result;
    }
}

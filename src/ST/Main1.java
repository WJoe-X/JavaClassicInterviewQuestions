package ST;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:33 2018/9/7
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] ints = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextLong();
            sum += ints[i];
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        double avg = (double)sum / n;
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (ints[i] > avg) {
                ints[i] = ints[i] - k;
            } else ints[i] = ints[i] + k;
            max = Math.max(max, ints[i]);
            min = Math.min(min, ints[i]);
        }

        System.out.println(max - min);

    }
}

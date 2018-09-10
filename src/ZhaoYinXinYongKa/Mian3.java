package ZhaoYinXinYongKa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:13 2018/8/30
 */
public class Mian3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String[] strings = s.split(" ");
        int[] ints = new int[strings.length];
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.valueOf(strings[i]);
            sum += ints[i];
        }
        System.out.println(getNum(ints, sum, n));

    }

    private static int getNum(int[] ints, int sum, int n) {
        int min = (sum % n == 0) ? (sum / n) : (sum / n + 1);
        if (ints.length > n)
            return 0;
        Arrays.sort(ints);
        int count = 0;
        int i = 0;
        while (min <= ints[ints.length - 1]) {
            while (i < ints.length && count < n) {
                if (ints[i] % min == 0) {
                    count = count + ints[i] / min;
                } else {
                    count = count + ints[i] / min + 1;
                }
                i++;
            }
            if (i == ints.length && count <= n)
                return min;
            count = 0;
            i = 0;
            min++;
        }
        return 0;
    }


}

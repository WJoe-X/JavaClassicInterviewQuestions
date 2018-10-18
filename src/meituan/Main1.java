package meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:15 2018/10/9
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
        }

        System.out.println(getNum(ints, target));
    }

    private static int getNum(int[] ints, int target) {
        if (ints == null || ints.length == 0)
            return 0;
        Arrays.sort(ints);
        int min = Integer.MAX_VALUE;
        int j = 0;
        int cur = 0;
        while (j < ints.length) {
            if (cur < target) {
                cur += ints[j];
            } else if (cur == target) {
                return target;
            } else {
                int temp = j - 2;
                int val = cur;
                while (temp >= 0 && cur >= target) {
                    if (cur == target)
                        return target;
                    if (min > cur)
                        min = cur;
                    cur -= ints[temp];
                    temp--;
                }
                cur = val;
            }
            j++;
        }
        return min;

    }
}

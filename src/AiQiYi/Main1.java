package AiQiYi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 10:43 2018/9/15
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getCount(s));

    }
    private static int getCount(String s) {
        if (s == null || s.length() != 6)
            return 0;
        int[] lefts = new int[3];
        int[] rights = new int[3];
        for (int i = 0; i < 3; i++) {
            lefts[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < 3; i++) {
            rights[i] = s.charAt(i + 3) - '0';
        }
        Arrays.sort(lefts);
        Arrays.sort(rights);
        int left = 0;
        int right = 0;
        for (int i = 0; i < 3; i++) {
            left += lefts[i];
            right += rights[i];
        }
        int sum1 = left;
        int sum2 = right;
        int count1 = 0;
        int count2 = 0;
        if (left == right)
            return 0;
        else if (left < right) {
            for (int i = 0; i < 3; i++) {
                if (left < right) {
                    count1++;
                    left += 9 - lefts[i];
                } else break;
            }
            left = sum1;
            for (int i = 2; i >= 0; i--) {
                if (left < right) {
                    count2++;
                    right -= rights[i];
                } else break;
            }
            return Math.min(count1, count2);
        } else {
            for (int i = 0; i < 3; i++) {
                if (right < left) {
                    count1++;
                    right += 9 - rights[i];
                } else break;
            }
            right = sum2;
            for (int i = 2; i >= 0; i--) {
                if (right < left) {
                    count2++;
                    left -= lefts[i];
                } else break;
            }
            return Math.min(count1, count2);
        }


    }


}

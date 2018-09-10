package Wangyi;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 15:47 2018/9/8
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getLength(s));
    }

    private static int getLength(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int countW = 0;
        int countB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'w')
                countW++;
            else if (s.charAt(i) == 'b')
                countB++;
        }
        if (countB > countW) {
            return countW * 2 + 1;
        } else if (countB < countW) {
            return countB * 2 + 1;
        } else return countB * 2;

    }
}

package ZhaoYinXinYongKa;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:44 2018/8/30
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getNum(s));
    }

    private static int getNum(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int len = s.length();
        int count = 0;
        int sum = 0;
        for (int i = len - 1; i > 0; i--) {
            if (s.charAt(i) == 'C') {
                count++;
            } else {
                sum += count;
            }
        }
        return sum;
    }


}

package Dianxin;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 13:46 2018/9/10
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = s.split(" ")[0];
        String b = s.split(" ")[1];
        if (a == null || b == null) {
            System.out.println(0);
            return;
        }
        int len1 = a.length();
        int len2 = b.length();
        if (len1 == 0 || len2 == 0) {
            System.out.println(0);
            return;
        }
        int maxLen = 0;
        int i = 0;
        if (len1 >= len2) {
            i = len1 - len2;
        }
        for (; i < len1; i++) {
            int tempLen = len1 - i;
            String tempA = a.substring(i);
            String tempB = b.substring(0, tempLen);
            if (tempA.equals(tempB)) {
                if (tempLen > maxLen) {
                    maxLen = tempLen;
                    break;
                }
            }
        }
        System.out.println(maxLen);
    }
}




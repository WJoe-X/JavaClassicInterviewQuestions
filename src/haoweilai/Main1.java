package haoweilai;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getNum(s));
    }

    private static int getNum(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int count = 0;
        int cur = 0;
        for (int i = 0; i < s.length(); i++) {
            cur = cur * 10 + s.charAt(i);
            if (cur % 3 == 0) {
                count++;
                cur = 0;

            }

        }
        return count;

    }
}

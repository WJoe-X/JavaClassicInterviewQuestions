package WangyiGame;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 18:59 2018/9/8
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(getS(strings[i]));
        }

    }

    private static String getS(String s) {
        if (s == null || s.length() == 0)
            return null;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            int count = 1;
            while (index + 1 < s.length() && s.charAt(index + 1) - s.charAt(index) == 1) {
                count++;
                index++;
            }
            if (count >= 4) {
                sb.append(s.charAt(index - count + 1));
                sb.append("-");
                sb.append(s.charAt(index));
            } else {
                for (int i = index - count + 1; i <= index; i++) {
                    sb.append(s.charAt(i));
                }
            }
            index++;
        }
        return sb.toString();

    }
}

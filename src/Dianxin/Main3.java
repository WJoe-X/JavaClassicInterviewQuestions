package Dianxin;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 13:34 2018/9/10
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.split(" ")[0];
        String s2 = s.split(" ")[1];
        int l1 = LCS(s1, s1.length(), s2, s2.length());
        int l2 = LCS(s2, s2.length(), s1, s1.length());
        int lcs = (l1 > l2) ? l1 : l2;
        System.out.println(lcs);

    }

    private static int LCS(String p, int n, String s, int m) {
        if (p == null || n <= 0 || s == null || m <= 0) return 0;
        int[] pr = computePrefix(s, m);
        int k = -1;
        for (int i = 0; i < n; i++) {
            while (k > -1 && s.charAt(k+1) != p.charAt(i))
                k = pr[k];
            if (s.charAt(k+1) == p.charAt(i)) k = k + 1;

            if (i != n - 1 && k == m - 1) k = pr[m - 1];
        }
        return k + 1;

    }

    private static int[] computePrefix(String p, int n) {
        if (p == null || n <= 0) return null;
        int[] pr = new int[n];
        for (int i = 0; i < n; i++) {
            pr[i] = -1;
        }
        int k = -1;
        for (int i = 1; i < n; i++) {
            while (k > -1 && p.charAt(k+1) != p.charAt(i)) k = pr[k];
            if (p.charAt(k+1) != p.charAt(i)) k = k + 1;
            pr[i] = k;
        }
        return pr;


    }
}

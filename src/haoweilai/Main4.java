package haoweilai;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:39 2018/8/28
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double r = 0;
        for (int i = 0; i <10000 ; i++) {
            r *=(double) m/n;
        }
        double result =  (1-r)*sum/(n-m);
        double ans = (double) m * (sum / n) ;
        System.out.printf("%.2f", result);
    }


}

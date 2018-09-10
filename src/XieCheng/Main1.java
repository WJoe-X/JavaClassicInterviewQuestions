package XieCheng;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:16 2018/9/4
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        System.out.println(getNum(l));
    }

    private static int getNum(long l) {
        if (l<=0)
            return 0;
        int sum = 0;
        while(l!= 0)
        {
            sum++;
            l=l&(l-1);
        }
        return sum;

    }
}

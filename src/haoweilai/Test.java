import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            Long x = scan.nextLong();
            Long k = scan.nextLong();
            unNormalCal3(x, k);

        }
    }


    // unNormalCal method（简便方法2，是一位大神想出来的，速度更不用说了）
    private static void unNormalCal3(Long x, Long k) {
        Long y = 0L;
        Long n = 1L;
        while (k > 0) {
            if (x % 2 != 0) {
                //此时x的二进制最右端为1的话，一直使x右移，就是找到x的为0的位置
                while (x % 2 != 0) {
                    n = n * 2;  //每移一位，n记录一下变化的值
                    x = x / 2;
                }
            }
            //如果k的二进制最右端为1，就使y加上n
            if (k % 2 != 0)
                y = y + n;
            n = n * 2;
            x = x / 2;
            k = k / 2; //同时使x,k右移，以便下一步判断
        }
        System.out.println(y);
    }
}

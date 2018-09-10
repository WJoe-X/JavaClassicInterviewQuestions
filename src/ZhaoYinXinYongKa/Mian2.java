package ZhaoYinXinYongKa;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:51 2018/8/30
 */
public class Mian2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] chars = s.split(" " );
        int [] ints = new int[chars.length];
        for (int i = 0; i <chars.length ; i++) {
            ints[i] = Integer.valueOf(chars[i]);
        }
        System.out.println(getNum(ints));
    }

    private  static int getNum(int[] ints){
        if (ints ==null||ints.length==0)
            return 0;
        int len = ints.length;
        int min = ints[0];
        int [] result = new int[len];
        result[0] =0;
        int max = 0;
        for (int i = 1; i <len ; i++) {
            result[i] = ints[i] -min;
            if (ints[i]<min)
                min = ints[i];
        }
        for (int i = 1; i <len ; i++) {
            max =Math.max(max,result[i]);
        }
        return max;
    }
}

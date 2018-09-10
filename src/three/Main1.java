package three;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:44 2018/8/27
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Integer [] x = new Integer[m];
        Integer [] y = new Integer[m];
        for (int i = 0; i <m ; i++) {
            x[i]= sc.nextInt();
            y[i]=sc.nextInt();
        }

        if (x==null||x.length==0)
            System.out.println(0);
        System.out.println(getArea(x,y));
    }

    private static Long getArea(Integer[] x, Integer[] y){
        long minx = Integer.MAX_VALUE;
        long maxx= Integer.MIN_VALUE;
        long miny = Integer.MAX_VALUE;
        long maxy =Integer.MIN_VALUE;
        for (int i = 0; i <x.length ; i++) {
            if (x[i]<minx)
                minx =x[i];
            else if (x[i]>maxx)
                maxx =x[i];
            if (y[i]<miny)
                miny=y[i];
            else if (y[i]>maxy)
                maxy =y[i];
        }
        Long max =(long) Math.max(maxx-minx,maxy-miny);
       return  max*max;
        //BigInteger bigInteger = new BigInteger(max.toString());
        //
        // return bigInteger.multiply(bigInteger);

    }



}

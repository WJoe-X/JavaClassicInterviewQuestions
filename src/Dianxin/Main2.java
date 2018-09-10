package Dianxin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 13:27 2018/9/10
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(GetUglyNumber_Solution(n));
    }


    private static int GetUglyNumber_Solution(int index) {
        if (index<=0)
            return 0;
        if (index<7)
            return index;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int n2=0;
        int n3= 0;
        int n5=0;
        while (list.size()<index){
            int num2 = list.get(n2)*2;
            int num3 = list.get(n3)*3;
            int num5 = list.get(n5)*5;
            int newNumbers =  Math.min(num2,Math.min(num3,num5));
            list.add(newNumbers);
            if (num2 == newNumbers) n2++;
            if (num3 == newNumbers) n3++;
            if (num5 == newNumbers) n5++;
        }
        return  list.get(index-1);
    }
}

package meituan;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 21:20 2018/8/22
 */
public class BigNumberSum {

    public static void main(String[] args) {
        System.out.println(add( "123456789","12345678910111213" ));
    }


    private  static String  add(String a ,String  b){
        StringBuilder  sa = new StringBuilder(a);
         sa.reverse();
        System.out.println(sa.toString());
         StringBuilder sb = new StringBuilder(b);

        Lock lock =new ReentrantLock();
         sb.reverse();
        System.out.println(sb.toString());
         StringBuilder result  = new StringBuilder();
         int i =0;
         int cur = 0;
         while (i<sa.length()||i<sb.length()){
             int ai = 0;
             int bi = 0;
             if (i<sa.length()){
                 ai= sa.charAt(i) -'0';
             }
             if (i<sb.length()){
                 bi = sb.charAt(i)-'0';
             }
             result.append((ai+bi+cur)%10);
             cur = (ai+bi+cur)/10;
             i++;
         }
         if (cur>0)
             result.append(cur);
         return  result.reverse().toString();
    }


    static String findNumber(List<Integer> arr, int k) {
        if(arr ==null ||arr.size()==0)
            return "NO";
        for(int i = 0; i<arr.size() ;i++){
            if(arr.get(i)==k)
                return "YES";
        }
        return "NO";

    }
}

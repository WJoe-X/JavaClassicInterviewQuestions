package WangyiGame;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:39 2018/9/8
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strings =new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            strings[i] =s;

        }
        for (int i = 0; i <n ; i++) {
            int one = Integer.valueOf(strings











































                    [i].split(" ")[0]);
            int two = Integer.valueOf(strings[i].split(" ")[1]);
            String value = strings[i].split(" ")[2];
            System.out.println(getValue(one, two, value));
        }
    }

    private static int getValue(int one, int two, String s) {
        if (s == null || s.length() == 0)
            return 0;
        int index =0;
        for (int i = 0; i <s.length() ; i++) {
            if (i+1<s.length()&&s.charAt(i)-'0'>=two)
                index=i;
        }
        int right = 0;
        int left = 0;
        for (int i = index; i >=0 ; i--) {
            left = getnum(s.charAt(i))*(int) Math.pow(one,index-i) +left;
        }
        for (int i =s.length()-1; i >index ; i--) {
            right = getnum(s.charAt(i))*(int) Math.pow(two,s.length()-1-i) +right;
        }
        for (int i = index+1; i <s.length() ; i++) {
            if (right ==left)
                return right;
            left=0;
            for (int j = i; j >=0 ; j--) {
                left = getnum(s.charAt(j))*(int) Math.pow(one,i-j) +left;
            }
            right = right-(int) Math.pow(two,s.length()-1-i)*getnum(s.charAt(i));
        }

        return right;

    }

    private static  int getnum(char c){
        if (c-'0'<10)
            return c-'0';
        else if (c=='A')
            return 10;
        else if (c=='B')
            return 11;
        else if (c=='C')
            return 12;
        else if (c=='D')
            return 13;
        else if (c=='E')
            return 14;
        else
            return 15;
    }
}

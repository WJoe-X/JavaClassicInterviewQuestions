package yuanfudao;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 16:05 2018/8/24
 */
public class FindEmail {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
      String s =    scanner.next();
        System.out.println(isExistEmail(s));
    }

    private static boolean isExistEmail(String s) {
        if (s == null || s.length() < 7)
            return false;
        int cur = 0;
        int i=0;
        while (i<s.length()-1){
            if (s.charAt(i) == '@' && isnumberAndLetter(s.charAt(i - 1))) {
                i++;
                cur = i;
                while (i < s.length() - 3){
                    if (isnumberAndLetter(s.charAt(i)))
                        i++;
                    else if (".com".equals(s.substring(i, i + 4))&&cur<i) {
                        System.out.println(s.substring(cur,i+4));
                         return true;
                    }
                    else break;
                }
            }
            else i++;
        }
        return false;


    }

    private static boolean isnumberAndLetter(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }
}

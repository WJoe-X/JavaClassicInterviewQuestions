import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:57 2018/9/10
 */
public class SubStringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getCount(s));
    }


    private static int getCount(String s) {
        if (s == null || s.length() == 0)
            return 0;
        String str1 = s.replace("aibank", "");
        return (s.length() - str1.length())/6;
    }
}

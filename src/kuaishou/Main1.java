package kuaishou;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:33 2018/9/10
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String []str=new String[num];
        for(int i=0;i<num;i++)
        {
            Scanner sb=new Scanner(System.in);
            str[i]=sb.nextLine();
        }
        Arrays.sort(str);

        for(int i=0;i<num;i++)
        {
            System.out.println(str[i]);
        }
    }

    private static int isSub(String s1, String s2) {
        if (s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0)
            return 0;
        return s1.contains(s2) ? 1 : 0;


    }
}

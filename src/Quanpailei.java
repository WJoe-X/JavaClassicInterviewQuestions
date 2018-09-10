import java.util.ArrayList;
import java.util.List;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 21:11 2018/9/2
 */
public class Quanpailei {

    private static List<String> list = new ArrayList<>();

    private static List<String> getQuanpailie(char[] s, int n) {
        if (s == null || s.length == 0)
            return null;
        if (n > s.length - 1) {
            list.add(String.valueOf(s));
            return list;
        }
        for (int i = n; i < s.length; i++) {
            swap(s, i, n);
            getQuanpailie(s, n + 1);
            swap(s, n, i);
        }


        return list;
    }

    private static void swap(char[] s, int start, int end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }

    public static void main(String[] args) {
        String s = "sdfd";
        List<String> list = getQuanpailie(s.toCharArray(), 0);
        for (String st : list) {
            System.out.println(st);
        }
    }
}

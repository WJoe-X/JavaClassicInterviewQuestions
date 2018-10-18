import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:53 2018/10/17
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(get(n));
    }

    private static String get(int n) {
        boolean boo = true;
        if (n <= 0)
            return null;
        int i = 1;
        while (i * (i + 1) / 2 < n) {
            i++;
        }
        i = i - 1;
        if (i % 2 == 0)
            boo = false;
        int res = n - i * (i + 1) / 2;
        i = i + 1;
        Integer son = i - res + 1;
        Integer mom = res;
        String result ="";
        if (!boo) {
             result = son.toString() + "/" + mom.toString();
        }
        else {
            result = mom.toString() + "/" + son.toString();
        }return result;
    }
}

package kuaishou;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:10 2018/9/10
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String[] ss1 = s1.split(",");
        String[] ss2 = s2.split(",");
        int[] i1 = new int[ss1.length];
        int[] i2 = new int[ss2.length];
        for (int i = 0; i < ss1.length; i++) {
            i1[i] = Integer.valueOf(ss1[i]);
        }
        for (int i = 0; i < ss2.length; i++) {
            i2[i] = Integer.valueOf(ss2[i]);
        }
        int[] result = get(i1, i2);
        if (result == null || result.length == 0)
            return;
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ",");
        }
        System.out.print(result[result.length - 1]);
    }

    private static int[] get(int[] i1, int[] i2) {
        if ((i1 == null || i1.length == 0) && (i2 == null || i2.length == 0))
            return null;
        int[] result = new int[i1.length + i2.length];
        int index1 = 0;
        int index2 = 0;
        int i = 0;
        while (index1 < i1.length || index2 < i2.length) {
            if (index1 < i1.length && index2 < i2.length) {
                if (i1[index1] < i2[index2])
                    result[i++] = i1[index1++];
                else result[i++] = i2[index2++];
            } else if (index1 < i1.length)
                result[i++] = i1[index1++];
            else result[i++] = i2[index2++];
        }
        return result;
    }

}

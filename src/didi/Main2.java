package didi;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:33 2018/9/18
 */
public class Main2 {


    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        getCount(p, q, r);
        System.out.println(count);
    }

    private static void getCount(int p, int q, int r) {
        char[] chars = new char[p + q + r];
        for (int i = 0; i < p; i++) {
            chars[i] = 'p';
        }
        for (int i = p; i < q + p; i++) {
            chars[i] = 'q';
        }
        for (int i = q + p; i < q + p + r; i++) {
            chars[i] = 'r';
        }
        Permutation(chars, 0);
    }

    private static void Permutation(char chs[], int start) {
        if (start == chs.length - 1) {
            System.out.println(Arrays.toString(chs));
            count++;
        }
        for (int i = start; i <= chs.length - 1; i++) {
            if (i != start && chs[i] != chs[start]) {
                Swap(chs, i, start);
                Permutation(chs, start + 1);
                Swap(chs, i, start);
            }
        }
    }

    private static void Swap(char chs[], int i, int j) {
        char temp;
        temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }

}

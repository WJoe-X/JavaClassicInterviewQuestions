package beike;

import java.util.Arrays;
import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] ints = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if ('T' == str.charAt(i))
                ints[i] = 10;
            else if ('A' == str.charAt(i))
                ints[i] = 1;
            else if ('J' == str.charAt(i))
                ints[i] = 11;
            else if ('Q' == str.charAt(i))
                ints[i] = 12;
            else if ('K' == str.charAt(i))
                ints[i] = 13;
            else ints[i] = Integer.valueOf(str.charAt(i));
        }
        Arrays.sort(ints);
        System.out.println(4);
    }


}

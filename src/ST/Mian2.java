package ST;

import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:02 2018/9/7
 */
public class Mian2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int r = scanner.nextInt();
            int l = scanner.nextInt();
            char[][] blocks = new char[r][l];
            for (int j = 0; j < r; j++) {
                String s = scanner.nextLine();
                for (int k = 0; k < s.length(); k++) {
                    blocks[j][k] = s.toCharArray()[k];
                }
            }
            int[][] bb = new int[r][l];
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < l; k++) {
                    if (blocks[j][k] == 'C')
                        bb[j][k] = 2;
                    else if (blocks[j][k] == 'M')
                        bb[j][k] = 3;
                    else if (blocks[j][k] == 'Y')
                        bb[j][k] = 7;
                    else if (blocks[j][k] == 'B')
                        bb[j][k] = 5;
                    else if (blocks[j][k] == 'R')
                        bb[j][k] = 10;
                    else if (blocks[j][k] == 'G')
                        bb[j][k] = 9;
                    else if (blocks[j][k] == 'b')
                        bb[j][k] = 12;
                }
            }

            System.out.println();


        }
    }

    private boolean isSusess(int[][] blocks, int r, int l) {
        if (blocks == null || blocks[0].length == 0)
            return false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                if (blocks[i][j] != 0) {


                }
            }
        }
        return true;

    }

    private static char getColor(char orginal, char c) {
        if (orginal == c)
            return 'W';
        if (orginal == 'C') {
            if (c == 'B')
                return 'M';
            else if (c == 'G')
                return 'Y';
            else if (c == 'b')
                return 'R';
        } else if (orginal == 'M') {
            if (c == 'B')
                return 'C';
            else if (c == 'R')
                return 'Y';
            else if (c == 'b')
                return 'G';

        } else if (orginal == 'Y') {
            if (c == 'G')
                return 'C';
            else if (c == 'R')
                return 'M';
            else if (c == 'b')
                return 'B';
        }
        return 'c';

    }
}

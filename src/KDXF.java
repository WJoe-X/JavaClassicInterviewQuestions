import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 16:42 2018/9/7
 */
public class KDXF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int n = scanner.nextInt();
            int target = scanner.nextInt();
            int[] scores = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                scores[j] = scanner.nextInt();
                sum += scores[j];
            }
            System.out.println(getNum(scores,target,sum));
        }
    }

    private static int getNum(int[] scores, int target, int sum) {
        if (scores == null || scores.length == 0)
            return 0;
        Arrays.sort(scores);
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (target * scores.length <= sum)
                return count;
            else {
                sum = sum + 100 - scores[i];
                count++;
            }
        }
        return -1;


    }
}

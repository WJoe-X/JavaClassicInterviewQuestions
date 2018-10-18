import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @auther: WJoe
 * @Description: 平面上的点 同等扩展，相交就停下来，所以都停下来时候的 各个点的半径。
 * @Date : 20:15 2018/10/17
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[2][n];
        for (int i = 0; i < n; i++) {
            points[0][i] = sc.nextInt();
            points[1][i] = sc.nextInt();
        }
        double[] resluts = get(points);
        for (int i = 0; i <n ; i++) {
            String result = String.format("%.3f", resluts[i]);
            System.out.print(result);
            System.out.print(" ");
        }
    }

    private static double[] get(int[][] points) {
        if (points == null || points[0].length == 0)
            return null;
        int length = points[0].length;
        double[] result = new double[length];
        double[][] temps = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                temps[i][j] = getR(points[0][i], points[1][i], points[0][j], points[1][j]);
            }
        }
        double min = Integer.MAX_VALUE;
        int first = -1;
        int second = -1;
        double re = 0;
        Set<Integer> stops = new HashSet<>();
        while (stops.size() < length) {
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (temps[i][j]>0&&temps[i][j] < min) {
                        min = temps[i][j];
                        first = i;
                        second = j;
                    }
                }
            }
            re += min;
            if (!stops.contains(first)&&!stops.contains(second)) {
                result[first] = re/2;
                stops.add(first);
                result[second] = re/2;
                stops.add(second);
            }
           else if (!stops.contains(second)) {
                result[second] = re-result[first];
                stops.add(second);
            }
            else if (!stops.contains(first)) {
                result[first] = re-result[second];
                stops.add(first);
            }
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (temps[i][j] > 0)
                        temps[i][j] -= min;
                }
            }
            min = Integer.MAX_VALUE;
        }
        return result;
    }

    private static double getR(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}

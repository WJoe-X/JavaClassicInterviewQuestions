package pingduoduo;

import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 16:06 2018/9/21
 */
public class Main3 {

    static class YHQ {
        int max;
        int min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] foods = new int[n];
        for (int i = 0; i < n; i++) {
            foods[i] = sc.nextInt();
        }
        List<YHQ> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            YHQ yhq = new YHQ();
            yhq.max = sc.nextInt();
            yhq.min = sc.nextInt();
            list.add(yhq);
        }
        System.out.println(getCount(foods, list));
    }


    private static int getCount(int[] foods, List<YHQ> list) {
        if (foods == null || foods.length == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < foods.length; i++) {
            count += foods[i];
        }
        if (list == null || list.size() == 0)
            return count;
        Arrays.sort(foods);
        reverse(foods);
        Collections.sort(list, new Comparator<YHQ>() {
            @Override
            public int compare(YHQ o1, YHQ o2) {
                if (o1.max == o2.max) {
                    return o2.min - o1.min;
                } else
                    return o2.max - o1.max;
            }
        });
        int[][]  result = new int[list.size()][foods.length];

        return count;
    }

    private static void reverse(int[] foods) {
        int i = 0;
        int j = foods.length - 1;
        while (i < j) {
            int temp = foods[i];
            foods[i] = foods[j];
            foods[j] = temp;
            i++;
            j--;
        }
    }
}

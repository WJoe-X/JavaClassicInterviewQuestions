package pingduoduo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 15:42 2018/9/21
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] re = new int[n];
        for (int i = 0; i < n; i++) {
            re[i] = sc.nextInt();
        }
        System.out.println(get(re));
    }

    private static int get(int[] re) {
        if (re == null || re.length == 0)
            return 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < re.length; i++) {
            if (!map.containsKey(re[i])) {
                map.put(re[i], 1);
                count++;
            }
        }
        int i = 1;
        int max = 0;
        int maxCount = 0;
        while (i < count) {
            int[] cache = new int[i];
            int ct = 0;
            for (int j = 0; j < cache.length; j++) {
                cache[j] = -1;
            }
            for (int j = 0; j < re.length; j++) {
                int cacheV = cache[re[j] % i];
                if (cacheV == re[j])
                    ct++;
                else cache[re[j] % i] = re[j];
            }
            if (ct > maxCount) {
                maxCount = ct;
                max = i;
            }
            i++;
        }
        return max;
    }
}

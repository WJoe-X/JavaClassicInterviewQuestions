package didi;

import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:58 2018/9/18
 */
public class Main1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sr = s.split(" ");
        String[] result = getR(sr);
        for (int i = 0; i < 3; i++) {
            System.out.print(result[i] + " ");
        }
    }


    private static String[] getR(String[] sr) {
        if (sr == null || sr.length == 0)
            return null;
        String[] result = new String[3];
        Distance[] distances = new Distance[sr.length - 1];
        for (int i = 0; i < sr.length - 1; i++) {
            Distance distanc = new Distance();
            distanc.s = sr[i + 1];
            distances[i] = distanc;
        }
        for (int i = 0; i < sr.length - 1; i++) {
            distances[i].score = minDistance(sr[0], sr[i + 1]);
        }
        Arrays.sort(distances, new Comparator<Distance>() {
            @Override
            public int compare(Distance o1, Distance o2) {
                return o1.score - o2.score;
            }
        });
        for (int i = 0; i < 3; i++) {
            result[i] = distances[i].s;
        }
        return result;
    }

    private static int minDistance(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        char[] chars = "qwertasdfgzxcv".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map1.put(chars[i], 1);
        }
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];
        //初始化
        for (int i = 0; i <= n; i++)
            dp[i][0] = i;
        for (int i = 0; i <= m; i++)
            dp[0][i] = i;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    //当不同的时候，我们需要求三种操作的最小值
                    //其中dp[i - 1][j - 1]表示的是替换，dp[i - 1][j]表示删除字符，do[i][j - 1]表示的是增加字符
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 3;
                    if ((map1.containsKey(word1.charAt(i - 1)) && map1.containsKey(word2.charAt(j - 1))) ||
                            (!map1.containsKey(word1.charAt(i - 1)) && !map1.containsKey(word2.charAt(j - 1))))
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + 1);
                    else
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + 2);
                }
            }
        }
        return dp[n][m];
    }

    static class Distance {
        String s;
        int score;
    }
}

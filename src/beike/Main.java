package beike;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ints = new int[2][n];
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ints[0][i] = scanner.nextInt();
            ints[1][i] = scanner.nextInt();
        }
        int[][] course = new int[n][n];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            for (int j = 0 ; j < n; j++) {
                if (isConflect(ints[0][i], ints[1][i], ints[0][j], ints[1][j])) {
                    course[i][j] = 1;
                    count++;
                }
            }
        }
        int copy = count;
        if (count==0){
            System.out.println(n);
            for (int i = 1; i <n+1 ; i++) {
                System.out.print(i);
            }
            return;
        }
        for (int i = 0; i <n ; i++) {
               int j=0;
               int r =0;
               while (j<n&&course[i][j]==1){
                   count--;
                  j++;
            }
            while (r<n&&course[r][i]==1){
                   count--;
                   r++;
            }
            if (count ==-1){
                   result.add(i+1);
            }
            count =copy;
        }

        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        // 此排序是为了让每个List<String>的结果按照字典序输出
        // 但是并不需要，此题没要求
        Arrays.sort(strs);
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {

            char[] cs = str.toCharArray();
            // 将char数组按照字典顺序排序
            Arrays.sort(cs);
            String sortStr = String.valueOf(cs);
            // 排序后的String作为key，
            if (!map.containsKey(sortStr))
                map.put(sortStr, new ArrayList<>());
            map.get(sortStr).add(str);
        }
        // 注意ArrayList的构造方法的应用
        return new ArrayList<>(map.values());
    }

    private static boolean isConflect(int a1, int a2, int b1, int b2) {
        if ((a1 <= b1 && a2 > b1) || (a1 > b1 && a1 <= b2) || a1 == b1 || a2 == b2)
            return true;
        return false;


    }
}

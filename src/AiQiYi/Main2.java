package AiQiYi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 11:25 2018/9/15
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[] foodNums = new int[n];
        for (int i = 0; i < n; i++) {
            foodNums[i] = sc.nextInt();
        }
        String[] actions = new String[m];
        int[] nums = new int[m];
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            actions[i] = s.split(" ")[0];
            nums[i] = Integer.valueOf(s.split(" ")[1]);
        }
        System.out.println(getRand(foodNums, actions, nums, p));
    }


    private static int getRand(int[] foodNums, String[] actions, int[] nums, int p) {
        if (foodNums == null || foodNums.length == 0 || p > foodNums.length)
            return 0;
        int n = foodNums.length;
        for (int i = 0; i < actions.length; i++) {
            if ("A".equals(actions[i]))
                foodNums[nums[i]-1] += 1;
            else
                foodNums[nums[i]-1] -= 1;
        }
        int targer = foodNums[p-1];
        Arrays.sort(foodNums);
        for (int i = foodNums.length - 1; i >= 0; i--) {
            if (foodNums[i] == targer)
                return foodNums.length - i;
        }
        return foodNums.length - 1;

    }
}

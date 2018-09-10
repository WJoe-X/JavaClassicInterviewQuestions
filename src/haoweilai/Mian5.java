package haoweilai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mian5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(sc.nextInt());
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        int result = findlis(arr);

        System.out.println(result);
    }

    private static int findlis(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = 0;
        int maxindex = 0;
        int result = 0;
        int[] dp = new int[nums.length];
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            int cur = i;
            sum[i] = nums[i];
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if (dp[i]>max){
                        max = dp[i];
                        maxindex =i;
                    }
                }
            }
            for (int k = i - 1; k >= 0; k--) {
                if (dp[i]-1 ==0)
                    break;
                if (dp[k] == dp[i] - 1)
                    sum[cur] += nums[k];
                i = k;
            }
            i = cur;
        }

       /** int[] re = new int[maxindex+1];
        int index =1;
        for (int i = 0; i <nums.length ; i++) {
            if (index>maxindex)
                break;
            if (dp[i] ==index)
                re[index] =Math.max(re[index],nums[i]);
        }
        for (int i = 0; i <maxindex+1 ; i++) {
            result+=re[i];
        }
        **/
       max =0;
        for (int i = 0; i <sum.length ; i++) {
            max = Math.max(max,sum[i]);
        }
        return max;
    }
}



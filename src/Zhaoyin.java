import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 12:00 2018/9/8
 */
public class Zhaoyin {

    //输出一到n中连续和为n的正整数
    public static void getAns(int n) {
        List<List<Integer>> lists = new ArrayList<>();
        int beg = 1;
        int sum = 1;
        int cur = 1;
        while (beg <= n / 2 + 1) {
            if (sum == n) {
                List<Integer> list = new ArrayList<>();
                for (int k = beg; k <= cur; k++) {
                    list.add(k);
                }
                lists.add(list);
                sum = sum - beg;
                beg++;
                cur++;
                sum += cur;

            }
            if (sum > n) {

                sum = sum - beg;
                beg++;

            } else {
                cur++;
                sum += cur;
            }



        }
        System.out.println(Arrays.toString(lists.toArray()));

    }

    public static void main(String[] args) {
        getAns(15);


    }

}


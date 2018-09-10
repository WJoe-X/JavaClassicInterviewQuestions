
package KDXF;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 16:53 2018/9/7
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(getNum(list));

    }

    private static int getNum(List<Integer> list) {
        int count = 0;
        if (list == null || list.size() == 0)
            return 0;
        int cur = -1;

        while (cur != 0) {
            List<Integer> indexs = new ArrayList<>();
            cur = 0;
            int i = 0;
            while (i < list.size()) {
                if (i < list.size() - 1 && list.get(i) > list.get(i + 1)) {
                   indexs.add(list.get(i));
                    cur++;
                }
                    i++;

            }
            if (i == list.size()) {
                if (cur > 0) {
                    list.removeAll(indexs);
                    count++;
                    i = 0;
                } else {
                    return count;
                }
            }

        }
        return count;
    }

    private static void mergeSort(int[] arr,int x,int y,int []temp){
        if(y-x<=1)
            return;
        int m=(x+y)/2;
        mergeSort(arr,x,m,temp);
        mergeSort(arr,m,y,temp);
        int index=x,p=x,q=m;
        while(p<m||q<y){
            if(p>=m){
                temp[index++]=arr[q++];
            }else if(q>=y){
                temp[index++]=arr[p++];
            }else if(arr[p]<=arr[q]){
                temp[index++]=arr[p++];
            }else{
                temp[index++]=arr[q++];
            }
        }
        for(int i=x;i<y;i++){	//将辅助空间的有序元素复制回去
            arr[i]=temp[i];
        }
    }
}

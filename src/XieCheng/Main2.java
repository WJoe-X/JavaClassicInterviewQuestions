package XieCheng;


import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:28 2018/9/4
 */
public class Main2 {

    static class Order {
        int id;
        int start;
        int end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        List<Order> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Order order = new Order();
            order.id = sc.nextInt();
            order.start = sc.nextInt();
            order.end = sc.nextInt();
            list.add(order);
        }
        Collections.sort(list, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.start - o2.start;
            }
        });
        List<Integer> result = getNum(list, target, 0, list.size() - 1, new ArrayList<Integer>());
        if (result != null && result.size() != 0) {
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
        } else {
            System.out.println("null");
        }


    }

    private static List<Integer> getNum(List<Order> list, int target, int start, int end, List<Integer> result) {
        if (target < list.get(0).start || target > list.get(list.size() - 1).end || start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        if (list.get(mid).end < target) {
            return getNum(list, target, mid + 1, end, result);
        } else if (list.get(mid).start > target) {
            return getNum(list, target, start, mid - 1, result);
        } else if (list.get(mid).end >= target && list.get(mid).start <= target) {
            result.add(list.get(mid).id);

        }
        return result;
    }
}

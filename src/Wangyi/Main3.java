package Wangyi;

import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 16:33 2018/9/8
 */
public class Main3 {

    static class Person {
        int id;
        int score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Person> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                count++;
                sc.nextInt();
            } else {
                Person p = new Person();
                p.id = sc.nextInt();
                p.score = sc.nextInt();
                if (map.containsKey(p.id)) {
                    map.put(p.id, map.get(p.id) + 1);
                } else map.put(p.id, 1);
                max = Math.max(max, map.get(p.id));
                list.add(p);
            }
        }
        sc.close();
        System.out.println(getNum(list, count, map, max));
    }

    private static int getNum(List<Person> list, int count, TreeMap<Integer, Integer> map, int max) {
        if (list == null || list.size() == 0 || max < count)
            return 0;
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.score - o2.score;
            }
        });
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).score;
            count++;
            if (list.get(i).id == map.lastKey())
                max--;
            map.put(i, map.get(i) - 1);
            if (count > max)
                return sum;

        }
        return sum;
    }
}

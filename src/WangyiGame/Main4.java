package WangyiGame;


import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:25 2018/9/8
 */
public class Main4 {

    static class Arr {
        int start;
        int end;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        List<List<Arr>> lists = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int n = scanner.nextInt();
            List<Arr> ss = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                Arr arr = new Arr();
                arr.start = scanner.nextInt();
                arr.end = scanner.nextInt();
                ss.add(arr);
            }
            if (ss.size() == 0) {
                System.out.println("no");
                return;
            }
            Collections.sort(ss, new Comparator<Arr>() {
                @Override
                public int compare(Arr o1, Arr o2) {
                    return o1.start - o2.start;
                }
            });
           lists.add(new ArrayList<Arr>(ss));
        }
        for (int i = 0; i <m ; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            if (!isSuccess(  lists.get(i), 0,map))
                System.out.println("no");
        }

    }

    private static boolean isSuccess( List<Arr> ss, int index,Map<Integer,Integer> map) {
        if (ss == null || ss.size() == 0)
            return false;
        if (index == ss.size()) {
            System.out.println("yes");
            return true;
        }
        for (int i = 0; i < ss.size(); i++) {
            map.put(i, 1);
            if (isVaild(ss, i, map))
                return isSuccess(ss, index + 1,map);
        }
        return false;
    }

    private static boolean isVaild( List<Arr>  arrs, int index, Map<Integer, Integer> map) {
        for (int i = 0; i < arrs.size(); i++) {
            if (!map.containsKey(i) && arrs.get(i).start == arrs.get(index).end)
                return true;
        }
        return false;
    }
}

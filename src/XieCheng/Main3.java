package XieCheng;

import sun.misc.LRUCache;

import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:03 2018/9/4
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LRUCache lruCache = new LRUCache(n);
        List<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.next());
        }
        int i = 0;
        while (i < list.size()) {
            if ("p".equals(list.get(i))) {
                lruCache.put(Integer.valueOf(list.get(i + 1)), Integer.valueOf(list.get(i + 2)));
                i = i + 3;
            } else {
                System.out.println(lruCache.get(Integer.valueOf(list.get(i + 1))));
                i = i + 2;
            }
        }


    }

    static class LRUCache {

        private int capacity;
        private Map<Integer, Integer> cache;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new java.util.LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
                // 定义put后的移除规则，大于容量就删除eldest
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() > capacity;
                }
            };
        }

        public int get(int key) {
            if (cache.containsKey(key)) {
                return cache.get(key);
            } else
                return -1;
        }

        public void put(int key, int value) {
            cache.put(key, value);
        }
    }


}

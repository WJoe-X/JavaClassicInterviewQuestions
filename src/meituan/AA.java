package meituan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 15:33 2018/8/23
 */
public class AA {

    public static void main(String[] args) {


        List<String> a = new ArrayList<>();
        a.add("hello");
        a.add("hi");
        List<String> b = new ArrayList<>();
        b.add("o");
        b.add("bye");
        commonSubstring(a, b);

    }

    static void commonSubstring(List<String> a, List<String> b) {
        if (a == null || b == null || a.size() != b.size())
            return;
        int length = a.size();
        boolean  boo= false;
        for (int i = 0; i < length; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < a.get(i).length(); j++) {
                if (!map.containsKey(a.get(i).charAt(j)))
                    map.put(a.get(i).charAt(j), 1);
            }
            for (int j = 0; j < b.get(i).length(); j++) {
                if (map.containsKey(b.get(i).charAt(j))) {
                    System.out.println("YES");
                    boo = true;
                    break;
                }
            }
            if (!boo)
                System.out.println("NO");
            boo = false;
        }

    }
    static int countDuplicates(List<Integer> numbers) {
         if (numbers ==null ||numbers.size()<=1)
             return 0;
         Map<Integer ,Integer> map = new HashMap<>();
         int count = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            if (map.containsKey(numbers.get(i)))
                map.put(numbers.get(i),map.get(numbers.get(i))+1);
            else map.put(numbers.get(i),1);
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue()>1)
                count++;
        }
        return count;

    }
    class Node {
        Node left, right;
        int data;
        Node(int newData) {
            left = right = null;
            data = newData;
        }
    }
    private static int isPresent(Node root, int val){
        if (root ==null)
            return 0;
        if (root.data ==val)
            return 1;
        if (root.data>val)
            return isPresent(root.left,val);
        else return isPresent(root.right,val);

    }

    public static void bad() {
        throw new RuntimeException();
    }
}

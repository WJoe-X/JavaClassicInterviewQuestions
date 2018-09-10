package Dianxin;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 13:15 2018/9/10
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getSt(s));
    }

    private static String getSt(String s) {
        if (s == null || s.length() == 0)
            return null;
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() < min)
                min = (int) entry.getValue();
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min)
                min = entry.getValue();
        }
        Map<Character, Integer> result = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > min)
                result.put(entry.getKey(), 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (result.containsKey(s.charAt(i)))
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}

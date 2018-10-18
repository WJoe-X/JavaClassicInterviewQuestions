package pingduoduo;

import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 15:04 2018/9/21
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String > list = getMax(s);
        if (list ==null ||list.size() ==0)
            return;
        for (int i = 0; i <list.size()-1 ; i++) {
            System.out.print(list.get(i) +" ");
        }
        System.out.print(list.get(list.size()-1));
    }

    private static List<String> getMax(String s) {
        if (s == null || s.length() == 0)
            return null;
        Map<String, Integer> map = new HashMap<>();

       String rr =  s.replaceAll("\\pP","");



        String[] re = rr.split(" ");
        int max = 0;
        for (int i = 0; i < re.length; i++) {
            String r = re[i].toLowerCase();
            if (!map.containsKey(r))
                map.put(r, 1);
            else
                map.put(r, map.get(r)+1);
            max = Math.max(max, map.get(r));
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max)
                list.add(entry.getKey());
        }


        return list;

    }
}

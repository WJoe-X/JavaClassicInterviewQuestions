package keep;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

/**
 * @auther: WJoe
 * @Description:  第一题排课
 * @Date : 15:50 2018/8/24
 */
public class course {

   static    class  Time{
        int start;
        int end;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s= sc.nextLine();
        String [] strs = s.split(" ");
        List<Time> list = new ArrayList<>();
        for (int i = 0; i <strs.length ; i++) {
            Time time = new Time();
           time.start =Integer.valueOf(strs[i].split(",")[0]) ;
            time.end =Integer.valueOf(strs[i].split(",")[1]);
            list.add(time);
        }
        System.out.println(getIsConflict(list));
    }
    private  static boolean  getIsConflict(List<Time> list){
        Collections.sort(list, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return o1.start -o2.start;
            }
        });
        for (int i = 0; i <list.size()-1; i++) {
            if (list.get(i).end>list.get(i+1).start)
                return  false;
            if (list.get(i).start ==list.get(i+1).start)
                return  false;
        }
        return true;

    }
 }

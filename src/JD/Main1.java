package JD;

import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:52 2018/9/9
 */
public class Main1 {


    static class Box {
        int x;
        int y;
        int z;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Box[] boxes = new Box[n];
        for (int i = 0; i < n; i++) {
            Box box = new Box();
            box.x = sc.nextInt();
            box.y = sc.nextInt();
            box.z = sc.nextInt();
            boxes[i] = box;
        }
        System.out.println(getNum(boxes));
    }


    private static int getNum(Box[] boxes) {
        if (boxes == null || boxes.length == 0)
            return 0;
        Arrays.sort(boxes, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                if (o1.x > o2.x) {
                    return 1;
                } else if (o1.x == o2.x) {
                    if (o1.y > o2.y)
                        return 1;
                    else if (o1.y == o2.y) {
                        return o1.z - o2.z;
                    } else return -1;
                } else return -1;
            }
        });

        int count = 0;
        Box max = boxes[boxes.length - 1];
        int maxY = Integer.MIN_VALUE;
        int maxZ = Integer.MAX_VALUE;
        Box Y = new Box();
        Box Z = new Box();
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i].y > maxY) {
                maxY = boxes[i].y;
                Y = boxes[i];
            }
            if (boxes[i].z > maxZ) {
                maxY = boxes[i].z;
                Z = boxes[i];
            }

        }

        for (int i = 0; i < boxes.length; i++) {
                for (int j = boxes.length-1; j>i; j--) {
                    if (boxes[i].x < boxes[j].x && boxes[i].y < boxes[j].y && boxes[i].z < boxes[j].z) {
                        count++;
                        break;
                    }
            }
        }
        return count;


    }
}

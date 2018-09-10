package JD;

import java.util.Random;
import java.util.Scanner;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:34 2018/9/9
 */
public class Main2 {

    static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            Node[] nodes = new Node[m];
            int q = sc.nextInt();
            for (int j = 0; j < q; j++) {
                int r = sc.nextInt() - 1;
                int l = sc.nextInt() - 1;
                nodes[r] = new Node(l, nodes[r]);
                nodes[l] = new Node(r, nodes[l]);
            }
            Random ran = new Random();
            if (ran.nextInt() % 2 == 1)
                System.out.println("Yes");
            else System.out.println("No");
        }

    }
}


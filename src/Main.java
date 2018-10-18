/**
 * @auther: WJoe
 * @Description
 * @Date : 16:35 2018/10/16
 */

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        this.val = x;
    }
}

public class Main {
    ListNode head = null;
    public void add(int data) {
        ListNode newNode = new ListNode(data);
        //添加头结点
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printNode(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode list = null;
        if (l1.val < l2.val) {
            list = l1;
            list.next = mergeTwoLists(l1.next, l2);
        } else {
            list = l2;
            list.next = mergeTwoLists(l1, l2.next);
        }
        return list;
    }

    public static ListNode DeleteDupliacateNode1(ListNode head) {
        ListNode pPre = head;
        ListNode pCur = pPre.next;
        ListNode pNext;
        boolean bDup;
        while (pCur != null) {
            pNext = pCur.next;
            bDup = false;
            while (pNext != null && pCur.val == pNext.val) {
                pPre.next = pNext;
                pCur = pNext;
                pNext = pCur.next;
                bDup = true;
            }
            if (bDup)//pCur与原数据重复，删除
            {
                pPre.next = pNext;
            } else {
                pPre = pCur;//pCur没有重复，将pPre向后移动
            }
            pCur = pNext;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner fin = new Scanner(System.in);
        int n = fin.nextInt();
        int m = fin.nextInt();
        Main l1 = new Main();
        for (int i = 0; i < n; i++) {
            l1.add(fin.nextInt());
        }
        Main l2 = new Main();
        for (int i = 0; i < m; i++) {
            l2.add(fin.nextInt());
        }
        ListNode list = l1.mergeTwoLists(l1.head, l2.head);
        Main merge = new Main();
        merge.printNode(DeleteDupliacateNode1(list));
    }
}

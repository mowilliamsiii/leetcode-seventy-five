package dayfour;


//https://leetcode.com/problems/sort-list/
public class SortList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        ListNode ls = sortList(head);
        ListNode rs = sortList(slow);
        return merge(ls,rs);
    }

    public static ListNode merge(ListNode l1, ListNode l2){

        ListNode sortTemp = new ListNode(0);
        ListNode current = sortTemp;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
            l1 = l1.next;
        }

        if(l2 != null){
            current.next = l2;
            l2 = l2.next;
        }

        return sortTemp.next;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        sortList(n1);
    }
}

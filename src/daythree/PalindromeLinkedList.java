package daythree;

//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head;

        while(n1 != null && n1.next != null){
            n1 = n1.next.next;
            n2 = n2.next;
        }

        n2 = reverse(n2);
        n1 = head;

        while(n2 != null){
            if(n2.val != n1.val){
                return false;
            }
            n2 = n2.next;
            n1 = n1.next;
        }

        return true;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;


        boolean palindrome = isPalindrome(node1);
        System.out.println(palindrome);
    }
}

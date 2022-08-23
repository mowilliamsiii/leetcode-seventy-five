package dayfour;


//https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenLinkedList {
    public class ListNode {
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

    class Solution {

        public ListNode oddEvenList(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            //create two list *odd and *even
            while (even != null && even.next != null) {

            }

            //connect two linked lists
            odd.next = evenHead;
            return head;
        }
    }
}

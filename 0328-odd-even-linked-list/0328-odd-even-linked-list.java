/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd = head, even = head.next, root = even;
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = root;
        return head;
        
        // if(head==null || head.next==null)
        //     return head;
        // ListNode temp1 = head;
        // ListNode temp2 = head.next;
        // ListNode dummy = temp2;
        // while(temp2!=null && temp2.next!=null){
        //     temp1.next = temp2.next;
        //     temp1 = temp1.next;
        //     temp2.next = temp1.next;
        //     temp2 = temp2.next;
        // }
        // temp1.next=dummy;
        // return head;
    }
}


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
    public ListNode rotateRight(ListNode head, int k) {
        if( k == 0 || head ==null || head.next == null) return head;
        int len=1;
        ListNode cur=head;
        while(cur.next != null){
            len++;
            cur=cur.next;
        }
        k = len - (k%len);
        cur.next = head;
        while(k > 0){
            cur=cur.next;
            k--;
        } 
        head = cur.next;
        cur.next = null;
        return head;
    }
}
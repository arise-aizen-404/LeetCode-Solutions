/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if( k == 0 || head == NULL || head->next == NULL) return head;
        int len=1;
        ListNode *cur = head;
        while(cur->next != NULL){
            len++;
            cur=cur->next;
        }
        k = len - (k%len);
        cur->next = head;
        while(k > 0){
            cur=cur->next;
            k--;
        } 
        head = cur->next;
        cur->next = NULL;
        return head;
    }
};
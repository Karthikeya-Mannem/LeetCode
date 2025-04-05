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
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode temp = head;
        ListNode newtail = head;
        int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        temp.next = head;
        k = k%count;
        int NTsize = count-k;;
        for(int i = 1;i<NTsize;i++){
            newtail = newtail.next;
        }
        ListNode ans = newtail.next;
        newtail.next = null;
        return ans;
    }
}
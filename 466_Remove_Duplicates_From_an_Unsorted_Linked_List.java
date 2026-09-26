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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        // Your code goes here

        if(head == null || head.next == null)
            return head;
        
        Map <Integer, Integer> map = new HashMap<>();

        ListNode temp = new ListNode();
        temp.next = head;

        ListNode curr = head;
        ListNode prev = temp;

        while(curr != null){
            map.merge(curr.val, 1, Integer::sum);
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            if(map.get(curr.val) > 1)
                    prev.next = curr.next;

            else
                prev = curr;

            curr = curr.next;
        }
        
        return temp.next;
    }
}

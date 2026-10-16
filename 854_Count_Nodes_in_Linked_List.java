// Definition of singly linked list:
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() { val = 0; next = null; }
//     ListNode(int val) { this.val = val; next = null; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public int countNodes(ListNode head) {
        // Your code goes here

        int count = 0;
        
        while(head != null){
            head = head.next;
            count++;
        }

        return count;
    }
}

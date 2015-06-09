/**
  Problem Description: https://leetcode.com/problems/remove-linked-list-elements/
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode runner;
        ListNode walker;
        
        //If initial element(s) has the value that we want to delete
        while(head != null && head.val == val)
        {
            head = head.next;
        }
        if(head == null)
            return head;
        
        walker= head;
        runner = head.next;
        boolean isJump = false;
        while(runner != null)
        {
            if(runner.val == val)
            {
                walker.next = runner.next;
            }
            else
            {
                walker = runner;
            }
            runner = runner.next;
        }
        return head;
    }
}
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        while(l1 != null)
        {
            a1.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null)
        {
            a2.add(l2.val);
            l2 = l2.next;
        }
        
        if(a1.size() < a2.size())
        {
            int diff = a2.size() - a1.size();
            for(int i = 0; i < diff; i++)
            {
                a1.add(0);
            }
        } 
        
        if(a1.size() > a2.size())
        {
            int diff = a1.size() - a2.size();
            for(int i = 0; i < diff; i++)
            {
                a2.add(0);
            }
        } 
        
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int carry = 0;
        for(int i = 0; i < a1.size(); i++)
        {
            int tot = a1.get(i) + a2.get(i) + carry;
            if(tot >= 10)
            {
                String totnc = Integer.toString(tot);
                sum.add(Integer.parseInt(totnc.substring(1)));
                carry = 1;
            }
            else if(tot != 10)
            {
                sum.add(tot);
                carry = 0;
            }
            
        }
        if(carry == 1)
        {
            sum.add(carry);
        }

        ListNode finalListnode = new ListNode(sum.get(0));
        ListNode current = finalListnode;

        for(int i = 1; i < sum.size(); i++)
        {
            current.next = new ListNode(sum.get(i));
            current = current.next;
        }
            

        return finalListnode;
    }
}
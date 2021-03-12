import com.azul.crs.com.fasterxml.jackson.databind.util.LinkedNode;

import java.util.ArrayList;
import java.util.Arrays;

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
public class Test210312 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();

        /*while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                result.next = new ListNode(l1.val);
                result = result.next;
                l1 = l1.next;
            } else {
                result.next = new ListNode(l2.val);
                result = result.next;
                l2 = l2.next;
            }

        }

        if (l1 != null) {
            result.next = l1;
        }

        if (l2 != null) {
            result.next = l2;
        }*/

        return l1;
    }
}

class ListNode {
      int val;
      ListNode next; // int val, ListNode next

      ListNode() {}

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }

}
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

        ListNode head = new ListNode(l1.val);

        //첫번째 위치의 노드가 필요하다. temp 노드를 생성한다.
        ListNode temp = new ListNode(0);
        temp.next = head; // next 변수가 첫번째 노드를 가르키면 됨

        head =temp;//temp 노드를 head가 가르키게함. 그럼 temp 노드가 첫번째 노드가 됨


        return head.next;
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
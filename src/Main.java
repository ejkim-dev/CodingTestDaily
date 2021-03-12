import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   List Node 사용 */
        ListNode l1 = new ListNode(4);
        System.out.println(l1.val);
        System.out.println(l1.next);

        l1.next = new ListNode(2, l1);
        System.out.println(l1.val);
        System.out.println(l1.next.val);

        l1.next = new ListNode(1, l1.next);
        System.out.println(l1.val);
        System.out.println(l1.next.val);

        System.out.println("--------------------");
        System.out.println(l1.val);
        System.out.println(l1.next.val);
        System.out.println(l1.next.next.val);
        System.out.println(l1.next.next.next.val);
        System.out.println(l1.next.next.next.next.val);
        System.out.println(l1.next.next.next.next.next.val);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3, l2);
        l2.next = new ListNode(4, l2);





        //System.out.println(test210312.mergeTwoLists(l1, l2).val);

    }
}

public class ReorderList {
    public static void main(String[] args) {
        ReorderList obj = new ReorderList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        obj.reorderList(head);
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next, prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        slow.next = null;
        ListNode p1 = head, p2 = prev;
        while(p2 != null){
            ListNode tempP1 = p1.next;
            p1.next = p2;
            ListNode tempP2 = p2.next;
            p2.next = tempP1;
            p1 = tempP1;
            p2 = tempP2;
        }
    }
}

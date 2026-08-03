public class MiddleOfList {
    public static void main(String[] args) {
        MiddleOfList obj = new MiddleOfList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode middle = obj.middleNode(head);
        System.out.println("Middle node value: " + middle.val);
    }
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next == null)
            return slow;
        else
            return slow.next;
    }   
}

public class DetectCycleNode {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode res = head;
        while(true){
            if(fast.next == null || fast.next.next == null)
                break;
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(res != slow){
                    res = res.next;
                    slow = slow.next;
                }
                return res;
            }
        }
        return null;
    }
}

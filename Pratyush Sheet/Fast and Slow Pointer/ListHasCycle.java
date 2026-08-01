class ListHasCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle

        ListHasCycle solution = new ListHasCycle();
        boolean result = solution.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result);
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head;
        while(true){
            if(fast.next == null || fast.next.next == null)
                break;
            slow = slow.next;
            fast =fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
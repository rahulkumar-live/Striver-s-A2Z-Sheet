public class removeDuplicatesInList {
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode left = head, right = head.next;
        while(left.next != null){
            if(left.val == right.val){
                left.next = right.next;
            }
            else{
                left = left.next;
                right = right.next;
            }
            right = left.next;
        }
        return head;
    }
}

public class RemoveElement {
    public static void main(String[] args) {

    }

    public static ListNode removeElement(ListNode head, int val){
        // 1.next
        // 1 -> 2 -> 3 -> 6 -> 4 -> 5 -> 6
        // ^
        // P

        ListNode pointer = head;
        while(pointer.next != null){
            if(pointer.next.val == val){
                pointer.next = pointer.next.next;
            }else{
                pointer = pointer.next;
            }
        }
        return head.val == val ? head.next : head;
    }
}

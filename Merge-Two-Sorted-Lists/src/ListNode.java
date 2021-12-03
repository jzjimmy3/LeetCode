public class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode();
        ListNode tail = merge;
        while(true){
            if(list1 == null){
                tail.next = list2;
                break;
            }
            if(list2 == null){
                tail.next = list1;
                break;
            }
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            if(list2.val < list1.val){
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        return merge.next;
    }
}

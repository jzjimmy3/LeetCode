import java.util.HashMap;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    public boolean hasCycle1(ListNode head) {
        if(head == null) return false;
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while(pointer2.next != null && pointer2.next.next != null){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
            if(pointer1 == pointer2) return true;
        }
        return false;
    }

    // public boolean hasCycle(ListNode head) {
    // if(head==null) return false;
    // ListNode walker = head;
    // ListNode runner = head;
    // while(runner.next!=null && runner.next.next!=null) {
    //     walker = walker.next;
    //     runner = runner.next.next;
    //     if(walker==runner) return true;
    // }
    // return false;
    // }

    public boolean hasCycle2(ListNode head) {
        ListNode curr = head;
        HashMap<ListNode, Integer> List = new HashMap <ListNode, Integer>();
        int i = 0;
        while(curr != null){
            List.put(curr,i);
            i++;
            curr = curr.next;

            if(List.containsKey(curr)){return true;}
        }
        return false;
    }
}



public class ListNode {
    int val;
    ListNode next;
    ListNode current = null;
    ListNode head = null;
    ListNode tail = null;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;}

    void add(int item){
        if(current != null){
            ListNode newNode = new ListNode(item, current.next);
            current.next = newNode;
            current = newNode;
        }else{
            head = tail = new ListNode(item,null);
            current = head;
        }
    }

    public void print(){
        ListNode curr = head;
        while( curr != null){
            System.out.println("The Current Node is " + curr.val);
            curr = curr.next;
        }
        System.out.println();
    }

    public static ListNode middleNode(ListNode head){
        System.out.println("1");
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        System.out.println("2");
        ListNode curr = head;
        if(curr == null && curr.next == null){
            System.out.println("3");
            return curr;
        }
        while(pointer2 != null && pointer2.next != null){
            pointer2 = pointer2.next.next;
            pointer1 = pointer1.next;
            System.out.println("hello");
        }
        return pointer1;
    }
    public static void main(String[] args) {
        ListNode newList = new ListNode();

        // added it, but did not link 
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        middleNode(newList);
        newList.print();
    }
}

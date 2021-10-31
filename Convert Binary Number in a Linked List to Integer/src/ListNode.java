

public class ListNode {
    int val;
    ListNode current = null;
    ListNode head = null;
    ListNode tail = null;
    ListNode next;
    ListNode(){}
    ListNode(int val) {this.val = val; }
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}


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

//    public static int getDecimalValue(ListNode head){
//        int ans = 0;
//        ListNode curr = head;
//        while(curr != null){
//            ans = (ans << 1) | curr.val;
//            curr = curr.next;
//        }
//        System.out.println(ans);
//        return ans;
//    }
//
    public int getDecimalValue(){
        int ans = 0;
        while(head != null){
            ans = (ans << 1) | head.val;
            head = head.next;
        }
        System.out.println(ans);
        return ans;
    }
//    public static void print(ListNode node){
//        while(node.next != null){
//            System.out.println("The Current Node is: " + node.val);
//            node = node.next;
//        }
//    }
    public void print(){
        ListNode curr = head;
        while( curr != null){
            System.out.println("The Current Node is " + curr.val);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        ListNode newBinary = new ListNode();
        newBinary.add(1);
        newBinary.add(0);
        newBinary.add(1);
        newBinary.print();
        newBinary.getDecimalValue();
    }
}

import java.util.Stack;

class BinarySearchTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    Node root;
    BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(18);
        rangeSumBST(tree.root, 7,15);
    }
    public static int rangeSumBST(Node root, int L, int R) {
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        System.out.println("stk: "+ stk);
        int sum = 0;
        while (!stk.isEmpty()) {
            Node n = stk.pop();
            if (n == null) { continue; }
            if (n.key > L) { stk.push(n.left); } // left child is a possible candidate.
            if (n.key < R) { stk.push(n.right); } // right child is a possible candidate.
            if (L <= n.key && n.key <= R) { sum += n.key; }
        }
        System.out.println("Sum: " + sum);
        return sum;
    }
}
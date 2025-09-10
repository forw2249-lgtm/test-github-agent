public class Duck {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node current, int data) {
        if (current == null) {
            return (new Node(data));
        } else if (data < current.data) {
            current.left = insertRec(current.left, data);
        } else if (data > current.data) {
            current.right = insertRec(current.right, data);
        } else {
            System.out.println("Duplicate item not inserted");
        }
        return current;
    }

    boolean search(int data) {
        return searchRec(root, data);
    }

    boolean searchRec(Node current, int data) {
        if (current == null) {
            return false;
        } else if (data == current.data) {
            return true;
        } else if (data < current.data) {
            return searchRec(current.left, data);
        } else {
            return searchRec(current.right, data);
        }
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node current) {
        if (current!= null) {
            inorderRec(current.left);
            System.out.print(current.data + " ");
            inorderRec(current.right);
        }
    }

    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node current) {
        if (current!= null) {
            System.out.print(current.data + " ");
            preorderRec(current.left);
            preorderRec(current.right);
        }
    }

    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node current) {
        if (current!= null) {
            postorderRec(current.left);
            postorderRec(current.right);
            System.out.print(current.data + " ");
        }
    }

    public static void main(String[] args) {
        Duck tree = new Duck();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree is ");
        tree.inorder();

        System.out.println("\nPreorder traversal of the given tree is ");
        tree.preorder
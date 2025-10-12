Here's an example of how you might implement a basic Binary Tree and its operations (insert, search) using Generics to allow any object type as data within the nodes. Additionally, I will provide methods for preorder traversal which is commonly asked:

```java
public class TreeNode<T> {
    T key;
    Node left, right;
    
    public TreeNode(T item) {
        key = item;
        left = null;
        right = null;
    end(); // Initialize the children to their default states (null).
    } 
}

public class BinaryTree<T extends Comparable<T>> {
    
    private TreeNode<T> root;
    
    public BinaryTree() {
        this.root = null;
    }
    
    // Insert a new key into the tree. If the inserted key already exists, its reference is not changed in any way. 
    public void insert(T key) {
        if (this.root == null) {
            this.root = new TreeNode<>(key);
        } else {
            root = recursiveInsert(root, key); // The actual work happens here for non-empty trees.
        }
    }
    
    private static class NodeComparator implements Comparator<TreeNode<?>> {
        
        public int compare(TreeNode<?> n1, TreeNode<?> n2) {
            return ((Comparable<?>)n1.key).compareTo((Comparable<?>)n2.key);
        } 
    }    
    
    private Node<T> recursiveInsert(Node<T> node, T key) {        
        if (node == null) {
            return new TreeNode<>(key); // If the subtree is empty, we simply insert here.
        } else if (((Comparable<?>)node.key).compareTo((Comparable<?>)key) < 0) {            
            node.left = recursiveInsert(node.left, key);
        } else if (((Comparable<?>)node.key).compareTo((Comparable<?>)key) > 0) {            
            node.right = recursiveInsert(node.right, key);
        } // No need to handle duplicate keys here; insertion is not changed in any way for duplicates as per this implementation's design choice.        
                   
        return node; // Return the updated subtree with or without modifications (duplicates are untouched). 
    }    
    
    public boolean search(T key) {
        Node<T> current = root;
         
        while (current != null) {            
            int comparisonResult = ((Comparable<?>)key).compareTo((Comparable<?>)current.key);
                        
            if (comparisonResult < 0 && current.left != null) {                // Left child and left of root, go to the left subtree recursively.
                current = current.left;            
            } else if(comparisonResult > 0 && current.right != null) {         // Right child and right of root, go to the right subtree recursively.   
                current = current.right;         
            } else if (comparisonResult == 0) {                              // Found a match in this node: return true immediately since we've found it.    
                return true;  
            }       
            
            // No matching child was encountered, so move to next level up of the tree or end search and report failure if no more levels (the null case).        
            else {                         
                current = root;              // Go back to original start node.     
            } 
        }    
        
        return false; // Key not found after traversing whole subtree/tree, or the tree is empty at this point as per input data (an edge case).   
   0x6a3e79ab>JavaCode for implementing a binary search tree in Java: Includes insertion and searching functionality.<|im_sep|>Here's an implementation of a Binary Tree class with generics, along with methods to handle the creation of nodes (`insert`), node validation (checking if it already contains data), as well as performing some common operations like `inOrderTraversal`, which prints out all elements in ascending order. I have also added functionality for searching an element and inserting a duplicate:

```java
import java.util.*;

public class BinarySearchTree<T extends Comparable<T>> {
    
    private TreeNode<T> root; // The starting point of the tree (null initially)

    public void insert(T value) {
        if (root == null) {
            this.root = new TreeNode<>(value);
        } else {
            this.root = this.insertIntoTree(this.root, value); // Insert into the root of a non-empty tree. 
        }
    }
    
    private TreeNode<T> insertIntoTree(TreeNode<T> node, T value) {        
        if (value.compareTo(node.getKey()) < 0) { // Go left for less than the root key
            if (node.left != null) return this.insertIntoTree(node.left, value); // Insert into the left subtree            
            node.left = new TreeNode<>(value); // Or create a leaf on the left side        
        } else { // More than or equal to root key; go right          
            if (node.right != null) return this.insertIntoTree(node.right, value);    
            node.right = new TreeNode<>(value); // Or create a leaf on the right side        
        } 
        return node; // Return current root after possibly insertion            
    }      
    
    public void inOrderTraversal() {
        if (root != null) this.inOrderHelper(this.root, System.out); // Start from root and print all values  
    }        
                 
    private void inOrderHelper(TreeNode<T> currentNode, PrintStream out){         
        if (currentNode != null) {            
            this.inOrderHelper(currentNode.getLeft(), out); // Visit left child first             
            System.out.print(currentNode.getKey() + " ");          
            this.inOrderHelper(currentNode.getRight(), out);  // Then visit right child                     
        }            
    }        
    
    public boolean searchForValue(T value) {      
        TreeNode<T> current = root;  
         
        while (current != null && !value.equals(root.getKey())) {           
            if (value.compareTo(current.getKey()) < 0) {             // Search on the left side recursively              
                current = current.left;                        
            } else if (value.compareTo(current.getKey()) > 0) {   // Or search on the right             
                current = current.right;                         
            } else {                    
                return true;   
            }          
        }      
        
        return false; // Key not found after traversing whole tree            
    }
     
    public void printTree(PrintStream out) { 
        this.printHelper(root, "", out);  
    }    
                    
    private String printHelper(TreeNode<T> node, String indent, PrintStream out) {        
        if (node == null) return "";      
            
        System.out.println(indent + "|--" + node.getKey()); // Visit current element and recursively the left-right subtrees          
                 
        indent += "\t";   // Increase indentation for child elements        
              
        String l = this.printHelper(node.left, indent, out);    
        String r = this.printHelper(node.right, indent, out);      
            
        return (l + r).substring(0, Math.min(indent.length(), 3)); // Print with maximum indentation of three tabs for readability        
    }     
}
```

Note that the `TreeNode` class which represents each node in our tree is not implemented here due to space limitations and because it's quite straightforward based on this context:

```java
public class TreeNode<T> {
    
    private T key;
    private Node left, right;
    
    public TreeNode(T item) {
        key = item;
        left = null;
        right = null;
    } 

    // Getter and Setters are omitted for brevity. You should implement them as needed in your application design.  
}
```
 /* Assignment 7 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (60 marks)
    Use Java to implement a binary tree and implement the following classes and methods.
    * 1. Design the class for the binary tree
    * 2. addChild: adds a child to a node if the node does not have two children already.
    * 3. deleteChild: delete a child from a node if the child is a leaf node.
    * 4. In the main() method, use your code to build a tree A in the following example.
    * 5. Delete the node with key=20 in tree A, to get the Tree B in the following example.

* Example:
           50                            50
        /     \         delete(20)      /   \
      30      70       --------->    30     70
     /  \    /  \                     \    /  \
   20   40  60   80                   40  60   80
         (tree A)                       (Tree B)

 */

// Class containing left and right child of current node and key value
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// A Java program to introduce Binary Tree
class Q2_BinaryTree {
    // Root of Binary Tree
    Node root; // The root node of the binary tree.

    // Design the constructor of the class 'Q2_BinaryTree'

    // (5 marks)
    Q2_BinaryTree () {
        /* place your code here */
        root = null;

    }

    // addChild() adds 'child_node' as a child of the 'parent_node'.
    // if 'is_left' is true, then add the 'child_node' as a left child of the 'parent node'
    // if 'is_left' is false, then add the 'child_node' as a right child of the 'parent node'
    // if the target position of the child is already taken, then we should stop adding.
    // (20 marks)
    public void addChild(Node parent_node, Node child_node, boolean is_left){
        /* place your code here */
        //if the target position of the child is already taken, then we should stop adding.
        if(is_left){
            if(parent_node.left==null){
                parent_node.left=child_node;
            }
        }
        else{
            if(parent_node.right==null){
                parent_node.right=child_node;
            }
        }


    }

    // deleteChild() deletes a child of the 'parent_node'.
    // if 'is_left' is true, then delete the left child of the 'parent_node'
    // if 'is_left' is false, then delete the right child of the 'parent_node'
    // if the target child to delete is null, then the deletion should stop.
    // (20 marks)
    public void deleteChild(Node parent_node, boolean is_left) {
        /* place your code here */
        if(is_left){
            if(parent_node.left!=null){
                parent_node.left=null;
            }
        }
        else{
            if(parent_node.right!=null){
                parent_node.right=null;
            }
        }

    }

    // This method is for TA's use.
    public void printTree() {
        String prefix = "";
        printTreeCore(prefix, this.root, false);
    }

    // This method is for TA's use.
    private void printTreeCore(String prefix, Node n, boolean isLeft) {
        if (n != null) {
            System.out.println (prefix + (isLeft ? "L-- " : "R-- ") + n.key);
            printTreeCore(prefix + (isLeft ? "|   " : "    "), n.right, false);
            printTreeCore(prefix + (isLeft ? "|   " : "    "), n.left, true);
        }
    }

    public static void main(String[] args) {
        /* place your code here to build Tree A (10 marks) */
       Q2_BinaryTree treeA = new Q2_BinaryTree();
       treeA.root = new Node(50);
       treeA.addChild(treeA.root,new Node(30),true);
       treeA.addChild(treeA.root,new Node (70),false );
       treeA.addChild(treeA.root.left,new Node (20),true);
       treeA.addChild(treeA.root.left,new Node (40),false);
       treeA.addChild(treeA.root.right,new Node (60),true);
       treeA.addChild(treeA.root.right,new Node (80),false);

       System.out.println("Tree A: ");
       treeA.printTree();

       // To make Tree A in to Tree B We have to delete the 20 leaf, left side of 30, so we must access the 30 branch and delete the LEFT side
        treeA.deleteChild(treeA.root.left,true);

        System.out.println("\n\nTree B: ");
        treeA.printTree();

    }
}
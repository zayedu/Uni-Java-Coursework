 /* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (50 marks in total)
    Use mutils.BinarySearchTree as a basic structure to implement a TreeMap for <String, Integer>.
    You cannot use JCF provided map.
 */

import mutils.BinarySearchTree;
import mutils.Node;

import java.util.ArrayList;

 public class Q1_TreeMapByBST {

    // use m_bst as the basic data structure for the treemap of <String, Integer>
    BinarySearchTree m_bst = new BinarySearchTree();

    // Question 1.1 (5 marks): implement method size().
    // Returns the number of elements in this map (its cardinality).
    // You can ONLY modify the body of this method including the return statement.
    public int size(Node root){
        //return size of binary tree
        //traverse binary tree and count nodes recursively
        if(root != null){
            return 1 + size(m_bst.root.left) + size(root.right);
        }

        return 0;

    }


    // Question 1.2 (5 marks): implement method isEmpty().
    // Returns true if this map contains no elements, otherwise return false.
    // You can ONLY modify the body of this method including the return statement.
    public boolean isEmpty() {
        //return true if binary tree is empty
       if(m_bst.root == null){
           return true;}


        return false;
    }

    // Question 1.3 (15 marks) implement method get().
    // If key is contained in the map, return the value of the key.
    // If key is not contained in the map, return -1.
    // You can ONLY modify the body of this method including the return statement.
    public int get(String key) {
        //return value of key if key is contained in map
        //return -1 if key is not contained in map
        //traverse tree to find key
        //if key is found return value

        Node current = m_bst.root;
        while(current != null){
            if(current.data.equals(key)){
                return current.freq;
            }
            else if(current.data.compareTo(key) > 0){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }

        return -1;
    }

    // Question 1.4 (15 marks) implement method put().
    // If the key is already contained in the map, overwrite the old value and return -1;
    // If the key is not contained in the map, add a new <key,value> entry to the map and return 1;
    // You can ONLY modify the body of this method including the return statement.
    public void put(String key, int value) {
        //if key is already contained in map, overwrite old value and return -1
        //if key is not contained in map, add new <key,value> entry to map and return 1
        //traverse tree to find key
        //if key is found, overwrite old value and return -1
        //if key is not found, add new <key,value> entry to map and return 1
        Node current = m_bst.root;
        while(current != null){
            if(current.data.equals(key)){
                current.freq = value;
                return;
            }
            else if(current.data.compareTo(key) > 0){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }

        m_bst.insert(new Node(key, value));
        return;


    }

    //adding inorder traversal method
    public void inorder(Node root, ArrayList<String> keys){
        if(root == null){
            return;
        }
        inorder(root.left, keys);
        keys.add(root.data);
        inorder(root.right, keys);
    }


    // Question 1.5 (10 marks) implement method getKeysInAlphabeticalOrder().
    // return the keys of this map as an ArrayList<String> in Alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public ArrayList<String> getKeysInAlphabeticalOrder(){
        //return keys of map as ArrayList<String> in alphabetical order
        //traverse tree in order and add keys to ArrayList
        ArrayList<String> keys = new ArrayList<String>();
        inorder(m_bst.root, keys);
        return keys;


    }

     public ArrayList<String> getKeysByFrequency() {
         //sort binary tree by frequency using freq values
            //traverse tree in order and add keys to ArrayList
            ArrayList<String> keys = getKeysInAlphabeticalOrder();
            // bubble sort based on their frequenct
            String temp;
            boolean done = false;

            while(!done){
                done = true;
                for(int i = 0; i < keys.size() - 1; i++){
                    if(get(keys.get(i)) < get(keys.get(i + 1))){
                        temp = keys.get(i);
                        keys.set(i, keys.get(i + 1));
                        keys.set(i + 1, temp);
                        done = false;
                    }
                }
            }

         return keys;

     }
 }

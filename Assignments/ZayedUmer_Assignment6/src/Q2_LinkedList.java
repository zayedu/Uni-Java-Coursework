/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (40 marks)
    Use java to implement a data structure named LinkedList, and implement several methods of the LinkedList.

 */

import javax.lang.model.type.NullType;

class Node {
    int data; // 'data' stores the value of a node.
    Node next; // 'next' refers/points to the next node

    // the construction method of class Node.
    Node(int d) {
        data = d;
        next = null;
    }
}

class Q2_LinkedList {
    Node head;


    // Insert 'new_data' at the beginning of the LinkedList
    // (5 marks)
    public void insertAtBeginning(int new_data) {
        /* place your code here */
        Node insert = new Node(new_data);
        if (head == null){
            head = insert;

        }

        else {
            insert = new Node(new_data);
            insert.next = head;
            head = insert;
        }

    }

    // Insert 'new_data' at the end of the LinkedList
    // (5 marks)
    public void insertAtEnd(int new_data) {
        /* place your code here */


        Node ins=new Node(new_data);
       // System.out.println(head);
        if (head == null){
            head = ins;
        }
        else {
           // System.out.println("head not null "+head.data+ " " + head.next);

            Node temp;
            for (temp = head; temp.next != null; temp = temp.next) {

            }
            temp.next = ins;
        }
    }

    // Insert 'new_data' after a node referred to as 'prev_node'
    // (10 marks)
    public void insertAfter(Node prev_node, int new_data) {
        /* place your code here */

        if (prev_node==null ){
            Node n= new Node(new_data );
            head=n;

            return;
        }
        //Creating new Node
        Node new_node= new Node(new_data);

        //Adding new node after prev_node
        Node temp= prev_node.next;
        prev_node.next=new_node;
        new_node.next=temp;

    }

    // Delete a node located in 'position' of the Linked List. The first element of the LinkedList has a position=0.
    // (10 marks)
    void deleteNode(int position) {
        /* place your code here */

        if (position==0){
            head=head.next;
            return;
        }
        //Create dummy variable

        int length =0;
        for ( Node runner = head; runner!=null;runner=runner.next){
        length++;
        }

        if (position>=length){
            System.out.println("\nError position exceeds length of list");
            return;
        }
        Node temp = head;
        //Traverse to position
        for(int i = 0 ; i < position-1;i++){

            temp=temp.next;
        }

        temp.next=temp.next.next;
    }

    // Search for a node containing the value of 'key' in the LinkedList.
    // If there is a node in the LinkedList whose value is equal to 'key', then return 'true'.
    // If there is no node in the LinkedList whose value is equal to 'key', then return 'false'.
    // (15 marks)
    boolean search(Node head, int key) {
        /* place your code here */

        if (head == null){
           // System.out.print("Error head is empty \n");
            return false;
        }
        //Create dummy var
        Node temp=head;

        while (temp.next != null){
            if (temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    // Sort the nodes in the LinkedList in ascending orders of their values.
    // Requirement: please use bubble sort.
    // Example: for a LinkedList: head->3->5->1->4->2, the sorted LinkedList should be head->1->2->3->4->5.
    // (15 marks)
    void sortLinkedList(Node head) {
        /* place your code here */

        // Get length of list
        int length = 0;
        Node temp=head;
        while (temp != null){
            length++;
            temp=temp.next;
        }

        //Traverse
        for (int i =0; i<length;i++){
            Node curr =head;
            while (curr != null && curr.next != null){
                if (curr.data >curr.next.data){
                    // Swap Nodes
                    int t= curr.data;
                    curr.data=curr.next.data;
                    curr.next.data=t;
                }

                curr=curr.next;
            }
        }
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        /* TA may test different functions of the LinkedList here */
        /* The following is just an example of how to do the test. */

        Q2_LinkedList llist = new Q2_LinkedList();

      llist.insertAtEnd(1);

        //System.out.println("Ran insert at end");
        //llist.printList(); //1
        llist.insertAtBeginning(2);
       // System.out.println("Ran insert at beginning");
        //llist.printList(); //2,1
        llist.insertAtBeginning(3);
      //  System.out.println("Ran insert at beginning again");
       // llist.printList();//3,2,1


       llist.insertAtEnd(4);
        //llist.insertAtEnd(8);

        //llist.insertAtEnd(9);

        //System.out.println("Ran insert at end again");
        //3,2,1,4
        llist.insertAfter(llist.head.next, 5);
        //System.out.println("Ran insert after");//3,2,5,1,4

        System.out.println("Linked list: ");
        llist.printList();

       System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(1);
        llist.printList();//3,2,5,4

        System.out.println();
        int item_to_find = 3;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");
        //3,2,5,4
        llist.sortLinkedList(llist.head);
        System.out.println("\nSorted List: ");
        llist.printList();
        //2,3,4,5
    }
}
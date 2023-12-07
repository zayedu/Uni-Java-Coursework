/* Assignment 9 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (60 marks in total)
    use an Integer array to implement the following set named m_SetByArray
    you cannot use JCF provided set.
 */

import java.util.Objects;
import java.util.Set;

class m_SetByArray {
    // Use m_array to store all the items in the set.
    // This is a strict mandatory requirement of this assignment.
    // To keep it simple, we use a fixed length array with 100 items.
    Integer[] m_array = new Integer[100];
    int number_of_items = 0; // this variable keep track of how many items are in the set.

    // Question 2.1 (5 marks): implement method size().
    // Returns the number of elements in this set (its cardinality).
    // You can ONLY modify the body of this method including the return statement.
    public int size() {
        for (int i = 0; i < m_array.length; i++){
            if (m_array[i] != null){
                number_of_items++;
            }
        }
        return number_of_items;
    }

    // Question 2.2 (5 marks): implement method isEmpty()
    // Returns true if this set contains no elements, otherwise return false.
    // You can ONLY modify the body of this method including the return statement.
    public boolean isEmpty() {
        for (int i = 0; i < m_array.length; i++){
            if (m_array[i] != null){
                return false;
            }
        }
        return true;
    }

    // Question 2.3 (10 marks): implement method contains()
    /* Returns true if this set contains the specified element. More formally,
    returns true if and only if this set contains an element e such that Objects.equals(o, e).
    Parameters:
        o – element whose presence in this set is to be tested
    Returns:
        true if this set contains the specified element
    */
    // You can ONLY modify the body of this method including the return statement.
    public boolean contains(Integer o) {
        for (Integer num: m_array){
            if (Objects.equals(num, o)){
                return true;
            }
        }
        return false;
    }

    // Question 2.4 (15 marks): implement method add()
    /* Adds the specified element to this set if it is not already present.
     * If this set does not contain the element, add the element to this set
     * and return true.
     * If this set already contains the element, the call leaves the set
     * unchanged and return false.
     */
    // You can ONLY modify the body of this method including the return statement.
    public boolean add(Integer e) {
        for (Integer num: m_array){
            if (Objects.equals(num, e)){
                return false;
            }
        }
        for (int i = 0; i < m_array.length; i++){
            if (m_array[i] == null){
                m_array[i] = e;
                return true;
            }
        }
        return true;
    }


    // Question 2.5 (15 marks): implement method remove()
    /* Removes the specified element from this set if it is present.
     * Returns true if this set contained the element.
     * Returns false if this set does not contain the element
     */
    // You can ONLY modify the body of this method including the return statement.
    public boolean remove(Integer o) {

        for (int i = 0; i < m_array.length; i++){
            if (Objects.equals(m_array[i], o)){
                m_array[i] = null;
                // Shift every trailing element to the left by one position
                for (int j = i; j < m_array.length - 1; j++){
                    m_array[j] = m_array[j + 1];
                }
                return true;
            }
        }
        return false;
    }

    // Question 2.6 (5 marks): implement method clear()
    /* Removes all of the elements from this set. The set will be empty after this call returns. */
    // You can ONLY modify the body of this method including the return statement.
    public void clear() {
        for (int i = 0; i < m_array.length; i++){
            m_array[i] = null;
        }
    }

    // Question 2.7 (5 marks): print the set items
    public void printSet() {
        System.out.print("Print set as [ ");
        for (Integer num: m_array){
            if (num != null){
                System.out.print(num + ", ");
            }

        }
        System.out.println("]");
    }
}

public class Q2_SetByArray {

    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("Start testing with Integer ...");
        m_SetByArray test_integer = new m_SetByArray();
        System.out.println("Is empty? " + test_integer.isEmpty());
        System.out.println("Size is: " + test_integer.size());
        test_integer.add(1);
        test_integer.add(2);
        test_integer.add(3);
        test_integer.printSet();
        System.out.println("Testing on adding duplicate items");
        System.out.println("Can we add a duplicate item valued 2? " + test_integer.add(2));
        System.out.println("Can we remove value 2? " + test_integer.remove(2));
        test_integer.printSet();
        System.out.println("Can we add an old item valued 2 after removing? " + test_integer.add(2));
        test_integer.printSet();
        System.out.println("Can we clear all? ");
        test_integer.clear();
        test_integer.printSet();
    }
}

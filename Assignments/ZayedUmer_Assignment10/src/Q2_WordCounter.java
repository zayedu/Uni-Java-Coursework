/* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (50 marks in total)
    Use the Q1_TreeMapByBST to implement a WordCounter to count words in documents.
    You cannot use JCF provided map.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Q2_WordCounter {
    // use the m_treemap as the data structure for word counting
    Q1_TreeMapByBST m_treemap = new Q1_TreeMapByBST();

    // Question 2.1 (15 marks) implement buildTreeMap() to build a treemap that stores
    // the words and word frequencies of a document into m_treemap.
    // "filename" is the path to the file. Please use the "JingleBell.txt" under folder "data".
    // You can ONLY modify the body of this method including the return statement.
    public void buildTreeMap(String filename) throws FileNotFoundException {


        Scanner file = new Scanner(new File(filename));
        while(file.hasNext()) {
            String word = file.next();
            word = word.toLowerCase();
            word = word.replaceAll("[^a-zA-Z0-9-]", "");
            if (word.equals("1") || word.equals("2") || word.equals("3") || word.equals("4") || word.equals("5") || word.equals("6") || word.equals("7") || word.equals("8") || word.equals("9") || word.equals("0")) {
                continue;
            } else if (word.contains("-")) {
                String[] splitword = word.split("-");
                for (int i = 0; i < splitword.length; i++) {
                    if (m_treemap.get(splitword[i]) == -1) {
                        m_treemap.put(splitword[i], 1);
                    } else {
                        m_treemap.put(splitword[i], m_treemap.get(splitword[i]) + 1);
                    }
                }
            } else if (m_treemap.get(word) == -1) {
                m_treemap.put(word, 1);
            } else {
                m_treemap.put(word, m_treemap.get(word) + 1);
            }

        }


    }

    // Question 2.2 (15 marks) print all the counted words in the document in alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public void printWordsAlphabetical(){
        //print words in alphabetical order
        //traverse tree in alphabetical order
        //print word and frequency
        ArrayList<String> words = m_treemap.getKeysInAlphabeticalOrder();
        for(int i = 0; i < words.size(); i++){
            System.out.println(words.get(i) + " " + m_treemap.get(words.get(i)));
        }

    }

    // Question 2.3 (15 marks) write an output file named "Output.txt" under folder "data"
    // The output of will consist of two lists.
    // Each list contains all the words from the file, along with the number of times
    // that the word occurred.
    // One list is sorted alphabetically.
    // The other list is sorted according to the number of occurrences, with the most
    // common words (i.e., a word with a larger frequency or count is said to be more common)
    // at the top and the least common at the bottom.
    // IMPORTANT: the output format is given in the file "Output_Example.txt" under folder "data".
    // Input parameter "filename" is the path to the output file.
    public void outputResult(String filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            // Printing words in alphabetical order

            ArrayList<String> words = m_treemap.getKeysInAlphabeticalOrder();
            writer.write(words.size()+" words found in file:\n\n");

            writer.write("List of words in alphabetical order (with counts in parentheses):\n\n");
            for (int i = 0; i < words.size(); i++) {
                writer.write(words.get(i) + " (" + m_treemap.get(words.get(i)) + ")" +"\n");
            }

            // Printing words in order of frequency
            writer.write("List of words by frequency of occurence:\n\n");

            ArrayList<String> words2 = m_treemap.getKeysByFrequency();
            for (int i = 0; i < words2.size(); i++) {
                writer.write(words2.get(i) + " (" + m_treemap.get(words2.get(i)) +")\n");
            }

            writer.close();
            System.out.println("Results have been written to the file: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Question 2.4 (5 marks) call each of the above methods in the main() method to
    // successfully count the words and produce expected outputs.
    public static void main(String[] args){
        //create new WordCounter object
        Q2_WordCounter wordcounter = new Q2_WordCounter();
        //build treemap
        try{
            wordcounter.buildTreeMap("/Users/zayedumer/Documents/2OP3/Assignments/Assignment10/src/data/JingleBell.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        //print words in alphabetical order
        wordcounter.printWordsAlphabetical();
        //print words in order of frequency
        wordcounter.outputResult("/Users/zayedumer/Documents/2OP3/Assignments/Assignment10/src/data/Output.txt");


    }

}

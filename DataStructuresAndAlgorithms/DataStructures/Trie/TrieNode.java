package DataStructuresAndAlgorithms.DataStructures.Trie;

public class TrieNode {
    
    // Array for child nodes of each node
    TrieNode[] children;
    
    // Used for indicating the end of a string
    boolean isEndOfWord;

    // Constructor
    public TrieNode() {
      
        // Initialize the wordEnd 
        // variable with false
        isEndOfWord = false;

        // Initialize every index of 
        // the child array with null
        // In Java, we do not have to 
        // explicitely assign null as 
        // the values are by default 
        // assigned as null 
        children = new TrieNode[26];
    }
}
public class Tries {
    public static void main(String[] args) {
        System.out.println("Tries");
        System.out.println("Trie, also known as a prefix tree or digital tree, is a tree-like data structure that is used to \n" +
                "efficiently store and search a dynamic set of strings. The name \"trie\" comes from the word \"retrieval,\" \n"+
                "as one of its primary use cases is to retrieve strings with a given prefix efficiently.\n" +
                "\n" +
                "The key characteristic of a trie is that it organizes strings in a way that shares common prefixes among\n" +
                "the strings. Each node in the trie represents a single character of the strings, and the path from the \n" +
                "root to a particular node represents a specific string. The trie's structure allows for efficient \n" +
                "string retrieval, prefix matching, and insertion operations.");

        System.out.println("Properties of a Trie Data Structure\n" +
                "Now we already know that Trie has a tree-like structure. So, it is very important to know its properties.\n" +
                "Below are some important properties of the Trie data structure:\n" +
                "\n" +
                "-There is one root node in each Trie.\n" +
                "-Each node of a Trie represents a string and each edge represents a character.\n" +
                "-Every node consists of hashmaps or an array of pointers, with each index representing a character and a \n" +
                " flag to indicate if any string ends at the current node.\n" +
                "-Trie data structure can contain any number of characters including alphabets, numbers, and special characters. \n" +
                " But for this article, we will discuss strings with characters a-z. Therefore, only 26 pointers need for every \n" +
                " node, where the 0th index represents ‘a’ and the 25th index represents ‘z’ characters.\n" +
                "-Each path from the root to any node represents a word or string.");
    }
}

// Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated
// sequence of dictionary words. See following examples for more details.
// This is a famous Google interview question, also being asked by many other companies now a days.

public class WordBreakProblem {

    public static class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node(); // root always remain empty

    public static void insert(String word) {    // O(L) L = Largest word length
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;
    }

    public static boolean search(String key) {   // Time Complexity = O(L)
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.endOfWord == true;
    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        String key = "ilikesams";

        System.out.println(wordBreak(key));
    }
}

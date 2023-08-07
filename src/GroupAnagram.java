import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    public class GroupAnagram {

        // Trie Node class
        public static class TrieNode {
            TrieNode[] children;
            boolean isEndOfWord;

            TrieNode() {
                children = new TrieNode[26]; // Assuming only lowercase letters
                isEndOfWord = false;
            }
        }

        // Function to insert a word into the trie
        static void insert(TrieNode root, String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.isEndOfWord = true;
        }

        // Function to traverse the trie and collect anagrams
        static void traverse(TrieNode node, String word, List<String> anagrams) {
            if (node.isEndOfWord) {
                anagrams.add(word);
            }

            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    char c = (char) ('a' + i);
                    traverse(node.children[i], word + c, anagrams);
                }
            }
        }

        // Function to group anagrams using trie
        static List<List<String>> groupAnagrams(String[] words) {
            TrieNode root = new TrieNode();

            for (String word : words) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars); // Sort characters to handle anagrams
                String sortedWord = new String(chars);
                insert(root, sortedWord);
            }

            List<List<String>> result = new ArrayList<>();
            for (String word : words) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);

                List<String> anagrams = new ArrayList<>();
                traverse(root, sortedWord, anagrams);
                if (!anagrams.isEmpty()) {
                    result.add(anagrams);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String[] words = {"listen", "silent", "triangle", "integral", "glean", "angel"};
            List<List<String>> groupedAnagrams = groupAnagrams(words);

            for (List<String> group : groupedAnagrams) {
                System.out.println(group);
            }
        }
    }

public class CreatingTries {

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
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;
    }

    public static void main(String[] args) {
        String[] word = {"the", "a", "there", "their", "any", "thee"};
    }
}

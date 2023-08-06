public class PrefixProblem {

    public static class Node {
        Node [] children = new Node[26];
        boolean endOfWord = false;
        int freq;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }


    public static Node root = new Node();

    public static void main(String[] args) {

    }
}

public class PrefixProblem {

    public static class Node {
        Node [] children = new Node[26];
        boolean endOfWord = false;
        int freq = 0;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }


    public static void main(String[] args) {

    }
}

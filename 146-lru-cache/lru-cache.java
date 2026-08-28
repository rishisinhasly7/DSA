import java.util.HashMap;
import java.util.Map;

class LRUCache {
    int capacity;
    int size = 0;

    class Node {
        int key;
        int value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // dummy node: key/value never real, just a starting anchor for root
    Node root = new Node(-1, -1);
    Node head = root;

    // map key -> Node (not key -> value) so we can splice it out in O(size) traversal
    Map<Integer, Node> hash = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!hash.containsKey(key)) {
            return -1;
        }
        int value = hash.get(key).value;
        moveToBack(key);
        return value;
    }

    public void put(int key, int value) {
        if (hash.containsKey(key)) {
            hash.get(key).value = value;
            moveToBack(key);
            return;
        }

        // evict BEFORE adding, using >=, and never touch the dummy
       if (size >= capacity) {
    Node lru = root.next;
    root.next = lru.next;
    if (head == lru) {          // yehi missing check tha — list ab empty ho gayi
        head = root;             // head ko wapas anchor (root) pe reset karo
    }
    lru.next = null;
    hash.remove(lru.key);
    size--;
}
        Node newNode = new Node(key, value);
        hash.put(key, newNode);
        head.next = newNode;
        head = newNode;
        size++;
    }

    // finds node by key, unlinks it, and re-appends it at the back
    private void moveToBack(int key) {
        Node temp = root;
        Node prev = null;
        while (temp.key != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == head) {
            return; // already at the back, nothing to do
        }
        prev.next = temp.next;   // unlink
        temp.next = null;
        head.next = temp;        // re-append at back
        head = temp;
    }
}
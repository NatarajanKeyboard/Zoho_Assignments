
class Node {
    int key;
    String value;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + this.key + "|" + this.value + "]";
    }
}

class MyHashTable {
    private static int capacity = 10;
    private Node[] hashTable = new Node[capacity];
    private int size = 0;

    public int capacity() {
        return capacity;
    }

    public int size() {
        // int count=0;
        // for (Node node : hashTable) {
        // if(node!=null)
        // {
        // count++;
        // }

        // }
        // return count;

        return size;
    }

    public void resize() {
        capacity *= 2;
    }

    public void rehash() {
        Node[] newHashTable = new Node[capacity];
        Node[] oldHashTable = hashTable;
        hashTable = newHashTable;
        size=0;
        for (Node node : oldHashTable) {
            if (node != null) {
                add(node.key, node.value);
            }
        }
        // hashTable1=null;

    }

    public static int hash(int key) {
        return key % capacity;
    }

    public void add(int key, String value) {
        if (hashTable[hash(key)] == null) {
            hashTable[hash(key)] = new Node(key, value);
        } else {
            int probe = key + 1;
            while (probe <= capacity && hashTable[hash(probe)] != null) {
                probe++;
            }
            hashTable[hash(probe)] = new Node(key, value);

        }
        size++;
        System.out.println("added[" + key + "|" + value + "]\t\t\tsize:" + this.size() + " capacity:" + this.capacity());
        if (size > capacity * 0.75) {
            resize();
            rehash();
        }
    }

    public void printTable() {
        for (Node node : hashTable) {
            System.out.println(node + " ");
        }

    }

    public Node retrieve(int key) {
        for (Node nodeTarget : hashTable) {
            if (nodeTarget != null && nodeTarget.key == key)
                return nodeTarget;
        }
        return null;

    }

}

public class LoadFactor_and_Rehashing {
    public static void main(String[] args) {
        MyHashTable my = new MyHashTable();

        my.add(1, "hello");
        my.add(11, "this");
        my.add(2, "world");
        my.add(6, "ZSGS");
        my.add(6, "Zoho");
        for (int index = 0; index < 15; index++) {
            my.add(index, "yes"+index);
        }

        my.printTable();
        System.out.println("size:" + my.size() + " capacity:" + my.capacity());

        System.out.println("key: 6   "+my.retrieve(6));

    }
}

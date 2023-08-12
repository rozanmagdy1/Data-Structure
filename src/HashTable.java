import java.util.Hashtable;

public class HashTable {
    Hashtable<Integer, Integer>
            ht = new Hashtable<Integer, Integer>();

    public void addItem(int key, int value ) {
        ht.put(key, value);
    }

    public void removeItem(int key) {
        ht.remove(key);
    }

    public void displayHash() {
        System.out.println(ht);
    }
}

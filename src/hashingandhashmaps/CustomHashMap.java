package hashingandhashmaps;
import java.util.LinkedList;

/*
 * CustomHashMap
 * -------------
 * Implement a basic hash map using separate chaining.
 * Supports put, get, and remove operations.
 */

class Pair<K, V> {
    K key;
    V value;
    Pair(K key, V value) { this.key = key; this.value = value; }
}

public class CustomHashMap<K, V> {
    private final int SIZE = 16;
    private LinkedList<Pair<K, V>>[] map;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) map[i] = new LinkedList<>();
    }

    private int getIndex(K key) { return key.hashCode() % SIZE; }

    public void put(K key, V value) {
        int index = getIndex(key);
        for (Pair<K, V> pair : map[index]) {
            if (pair.key.equals(key)) { pair.value = value; return; }
        }
        map[index].add(new Pair<>(key, value));
    }

    public V get(K key) {
        int index = getIndex(key);
        for (Pair<K, V> pair : map[index]) {
            if (pair.key.equals(key)) return pair.value;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        map[index].removeIf(pair -> pair.key.equals(key));
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println(map.get("a")); // 1
        map.remove("a");
        System.out.println(map.get("a")); // null
    }
}

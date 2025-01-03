package Day_05.Generics;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
    public static void main(String[] args) {
        Pair<String, Integer> stringIntPair = new Pair<>("name", 42);
        Pair<Integer, String> intStringPair = new Pair<>(10, "hello");
        System.out.println(stringIntPair);
        System.out.println(intStringPair);
    }
}

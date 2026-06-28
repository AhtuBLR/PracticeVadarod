package GenericClass;

public class Information<K, V> {
    private K key;
    private V value;

    public Information(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        String k = key.toString();
        String v = value.toString();
        String result = "key: "  + k + ", " + "value: " + v;
        return result;
    }
}

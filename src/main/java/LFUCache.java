import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LFUCache {

//    private static class InnerCache<K, V> extends LinkedHashMap<K, V> {
//
//        private final int capacity;
//
//        public InnerCache(int capacity) {
//            super(capacity, 0.75f, true);
//            this.capacity = capacity;
//        }
//
//        @Override
//        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
//            return this.size() > capacity;
//        }
//    }

    /*
    * @param capacity: An integer
    */
    public LFUCache(int capacity) {
        // do intialization if necessary
    }

    /*
     * @param key: An integer
     * @param value: An integer
     * @return: nothing
     */
    public void set(int key, int value) {
        // write your code here
    }

    /*
     * @param key: An integer
     * @return: An integer
     */
    public int get(int key) {
        // write your code here
        return key;
    }
}

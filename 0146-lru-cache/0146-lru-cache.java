class LRUCache extends LinkedHashMap<Integer, Integer> {
    private final int maxCap;

    public LRUCache(int capacity) {
        super(capacity, 1.0f, true);
        maxCap = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > maxCap;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
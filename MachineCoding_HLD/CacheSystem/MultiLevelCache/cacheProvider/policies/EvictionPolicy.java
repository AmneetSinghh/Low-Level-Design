package MachineCoding_HLD.CacheSystem.MultiLevelCache.cacheProvider.policies;

public interface EvictionPolicy<Key> {

    void keyAccessed(Key key);// either read or write.

    /**
     * Evict key from eviction policy and return it.
     */
    Key evictKey();// always last key or any key. if storage full.
}

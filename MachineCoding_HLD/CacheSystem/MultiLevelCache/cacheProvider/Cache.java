package MachineCoding_HLD.CacheSystem.Cache;

import MachineCoding_HLD.CacheSystem.Cache.policies.EvictionPolicy;
import MachineCoding_HLD.CacheSystem.Cache.storage.Storage;
import MachineCoding_HLD.CacheSystem.Cache.exceptions.NotFoundException;
import MachineCoding_HLD.CacheSystem.Cache.exceptions.StorageFullException;

public class Cache<Key, Value> {
    private final EvictionPolicy<Key> evictionPolicy;
    private final Storage<Key, Value> storage;

    public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
        this.evictionPolicy = evictionPolicy;
        this.storage = storage;
    }

    public void put(Key key, Value value) {
        try {
            this.storage.add(key, value);
            this.evictionPolicy.keyAccessed(key);// key processed while read from LRU.
        } catch (StorageFullException exception) {
            System.out.println("Got storage full. Will try to evict.");
            Key keyToRemove = evictionPolicy.evictKey();
            if (keyToRemove == null) {
                throw new RuntimeException("Unexpected State. Storage full and no key to evict.");
            }
            this.storage.remove(keyToRemove);
            System.out.println("Creating space by evicting item..." + keyToRemove);
            put(key, value);
        }
    }

    public Value get(Key key) {
        try {
            Value value = this.storage.get(key);// key processed while write to LRU.
            this.evictionPolicy.keyAccessed(key);
            return value;
        } catch (NotFoundException notFoundException) {
            System.out.println("Tried to access non-existing key.");
            return null;
        }
    }


}
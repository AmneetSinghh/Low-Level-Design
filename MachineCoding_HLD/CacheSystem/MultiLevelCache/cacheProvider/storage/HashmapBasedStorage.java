package MachineCoding_HLD.CacheSystem.MultiLevelCache.cacheProvider.storage;

import MachineCoding_HLD.CacheSystem.MultiLevelCache.cacheProvider.exceptions.NotFoundException;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.cacheProvider.exceptions.StorageFullException;

import java.util.HashMap;
import java.util.Map;

public class HashmapBasedStorage<Key, Value> implements Storage<Key, Value> {

    Map<Key, Value> storage;
    private final Integer capacity;

    public HashmapBasedStorage(Integer capacity) {
        this.capacity = capacity;
        storage = new HashMap<>();
    }

    @Override
    public void add(Key key, Value value) throws StorageFullException {
        if (isStorageFull()) throw new StorageFullException("Capacity Full.....");
        storage.put(key, value);
    }

    @Override
    public void remove(Key key) throws NotFoundException {
        if (!storage.containsKey(key)) throw new NotFoundException(key + "doesn't exist in cache.");
        storage.remove(key);
    }

    @Override
    public Value get(Key key) throws NotFoundException {
        if (!storage.containsKey(key)) throw new NotFoundException(key + "doesn't exist in cache.");
        return storage.get(key);
    }

    private boolean isStorageFull() {
        return storage.size() == capacity;
    }
}

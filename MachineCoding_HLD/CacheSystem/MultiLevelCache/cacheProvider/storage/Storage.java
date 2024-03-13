package MachineCoding_HLD.CacheSystem.MultiLevelCache.cacheProvider.storage;


import MachineCoding_HLD.CacheSystem.MultiLevelCache.cacheProvider.exceptions.NotFoundException;
import MachineCoding_HLD.CacheSystem.MultiLevelCache.cacheProvider.exceptions.StorageFullException;

public interface Storage<Key, Value> {
    public void add(Key key, Value value) throws StorageFullException;

    void remove(Key key) throws NotFoundException;

    Value get(Key key) throws NotFoundException;
}
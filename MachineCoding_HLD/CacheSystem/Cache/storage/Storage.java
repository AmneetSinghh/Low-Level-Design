package MachineCoding_HLD.CacheSystem.Cache.storage;


import MachineCoding_HLD.CacheSystem.Cache.exceptions.NotFoundException;
import MachineCoding_HLD.CacheSystem.Cache.exceptions.StorageFullException;

public interface Storage<Key, Value> {
    public void add(Key key, Value value) throws StorageFullException;

    void remove(Key key) throws NotFoundException;

    Value get(Key key) throws NotFoundException;

    double getCapacity();
}
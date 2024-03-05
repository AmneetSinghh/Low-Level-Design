package MachineCoding_HLD.CacheSystem.Cache.policies;


import MachineCoding_HLD.CacheSystem.Cache.algorithms.DoublyLinkedList;
import MachineCoding_HLD.CacheSystem.Cache.algorithms.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Eviction policy based on LRU algorithm.
 * So LRU implementation is decouple from LRU algorithm, it is just using LRU using double linked list.
 */

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {

    // single responsibility,
    private DoublyLinkedList<Key> dll;
    private Map<Key, DoublyLinkedListNode<Key>> mapper;

    public LRUEvictionPolicy() {
        this.dll = new DoublyLinkedList<>();
        this.mapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key) {
        if (mapper.containsKey(key)) {
            dll.detachNode(mapper.get(key));
            dll.addNodeAtLast(mapper.get(key));
        } else {
            DoublyLinkedListNode<Key> newNode = dll.addElementAtLast(key);
            mapper.put(key, newNode);
        }
    }

    @Override
    public Key evictKey() {
        DoublyLinkedListNode<Key> first = dll.getFirstNode();
        if(first == null) {
            return null;
        }
        dll.detachNode(first);
        return first.getElement();
    }
}

package de.muenchen.dave.configuration;

import com.hazelcast.map.MapStore;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MyMapStore implements MapStore<String, String> {

    static int counter = 0;

    @Override
    public void store(String s, String s2) {
        counter++;
        System.out.println("store: " + s2);
    }

    @Override
    public void storeAll(Map<String, String> map) {
        System.out.println("storeAll: " + map.size());
    }

    @Override
    public void delete(String s) {
        System.out.println("delete");
    }

    @Override
    public void deleteAll(Collection<String> collection) {

    }

    @Override
    public String load(String s) {
        if (counter == 0)
            return null;
        return "world";
    }

    @Override
    public Map<String, String> loadAll(Collection<String> collection) {
        if (counter == 0)
            return Collections.emptyMap();
//        collection.stream().map(c -> )
        return Map.of("hello", "world");
    }

    @Override
    public Iterable<String> loadAllKeys() {
        if (counter == 0)
            return Collections.emptyList();
        return List.of("key");
    }
}

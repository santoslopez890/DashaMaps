package com.github.zipcodewilmington.sample;

public interface HashMapInterface {
    // fundamentals
     void set(String key, Integer value);
     Integer delete(String key);
     Integer get(String key);
     boolean isEmpty();
     long size();

    // testing access
    int bucketSize(String key); // used for tests
}

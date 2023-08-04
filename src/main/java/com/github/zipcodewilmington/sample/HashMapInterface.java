package com.github.zipcodewilmington.sample;

public interface HashMapInterface {
    // fundamentals
    public void set(String key, String value);
    public String delete(String key);
    public String get(String key);
    public boolean isEmpty();
    public long size();

    // testing access
    boolean bucketSize(String key); // used for tests
}

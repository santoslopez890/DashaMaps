package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.DashaMap;
import com.github.zipcodewilmington.NodeAndList.MyLinkedList;
import com.github.zipcodewilmington.NodeAndList.MyNode;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap1 extends DashaMap {
    public DashaMap1() {
        super();

    }
    private String hashFunctionOne(String input) {
        if (!input.isEmpty()) {
            return String.valueOf(Character.toLowerCase(input.charAt(0)));
        }
        return null;
    }
    @Override
    public void set(String key, Integer value) {
        String keyHash = hashFunctionOne(key);
        int keyHashIndex = getBucketIndex(keyHash);
        dash[keyHashIndex].add(key, value);
    }
    @Override
    public Integer delete(String key) {
        String keyHash = hashFunctionOne(key);
        int keyHashIndex = getBucketIndex(keyHash);
        return dash[keyHashIndex].remove(key);
    }

    @Override
    public Integer get(String key) {
        String keyHash = hashFunctionOne(key);
        int keyHashIndex = getBucketIndex(keyHash);
        MyNode result = dash[keyHashIndex].get(key);
        return result.getData().getValue();
    }

}
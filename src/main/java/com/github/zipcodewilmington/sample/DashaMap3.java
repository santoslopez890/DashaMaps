package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.DashaMap;
import com.github.zipcodewilmington.NodeAndList.MyNode;

public class DashaMap3 extends DashaMap {
    public DashaMap3(){
        super();
    }

    private String hashFunctionThree(String input) {
        if (input.length() > 1) {
            int alphaNumOne = alphabet.indexOf(input.charAt(0)) + 1;
            int alphaNumTwo = alphabet.indexOf(input.charAt(1)) + 1;
            return "" + alphabet.charAt((alphaNumOne + alphaNumTwo) % alphabet.length() - 1);
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        dash[keyHashIndex].add(key, value);
    }

    @Override
    public Integer delete(String key) {
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        return dash[keyHashIndex].remove(key);
    }
    @Override
    public Integer get(String key) {
        String keyHash = hashFunctionThree(key);
        int keyHashIndex = getBucketIndex(keyHash);
        MyNode result = dash[keyHashIndex].get(key);
        return result.getData().getValue();
    }
}

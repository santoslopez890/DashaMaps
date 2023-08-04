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
    private MyLinkedList[] dash;
    private String alphabet="abcdefghijklmnopqrstuvwxyz"

    public DashaMap1() {
        super();

    }
    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(Character.toLowerCase(input.charAt(0)));
        }
        return null;
    }
    public Integer set(String key,Integer value){
    String hashKey =HashFunctionOne(key);
    int hashKeyIndex=getBucketSize(hashKey);
        MyNode result= dash[hashKeyIndex].get(key);
    return result.getData().getValue();
    }
    public void get(String key,Integer value){
        String hashKey =HashFunctionOne(key);
        int hashKeyIndex=getBucketSize(hashKey);
        dash[hashKeyIndex].add(key,value);

    }

    public boolean isEmpty() {
        for (MyLinkedList mll : dash) {
            if (!mll.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public long size() {
        long totalSize = 0;
        for (MyLinkedList mll : dash) {
            totalSize += mll.size();
        }
        return totalSize;
    }
    public int bucketSize(String key){
        int letter=alphabet.indexOf(key);
        return dash[letter].size();
    }
}
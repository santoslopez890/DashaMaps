package com.github.zipcodewilmington;

import com.github.zipcodewilmington.NodeAndList.MyLinkedList;
import com.github.zipcodewilmington.sample.HashMapInterface;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapInterface {
    protected MyLinkedList[] dash;
    protected String alphabet="abcdefghijklmnopqrstuvwxyz";

    public DashaMap() {
        dash = new MyLinkedList[26];
        for (int i = 0; i < dash.length; i++) {
            dash[i] = new MyLinkedList();
            dash[i].add(" " + alphabet.charAt(i), null);
        }

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
@Override
public int bucketSize(String key){
        return dash[getBucketIndex(key)].size();
}
    public int getBucketIndex(String key){
        return alphabet.indexOf(key);
    }

}

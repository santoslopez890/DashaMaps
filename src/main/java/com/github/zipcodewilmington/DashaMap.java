package com.github.zipcodewilmington;

import com.github.zipcodewilmington.NodeAndList.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap {
    protected MyLinkedList[] dash;
    private String alphabet="abcdefghijklmnopqrstuvwxyz";

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
public int bucketSize(String key){
        return dash[getBucketSize(key)].size();
}
    public int getBucketSize(String key){
        return alphabet.indexOf(key);
    }

}

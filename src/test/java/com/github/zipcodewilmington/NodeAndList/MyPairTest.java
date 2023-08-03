package com.github.zipcodewilmington.NodeAndList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void testEquals() {
        MyPair myPair =new MyPair("no",1);
        MyPair myPair2 =new MyPair("no",1);
        assertEquals(myPair, myPair2);
    }

    @Test
    void getKey() {
    }

    @Test
    void setKey() {
    }

    @Test
    void getValue() {
    }

    @Test
    void setValue() {
    }
}
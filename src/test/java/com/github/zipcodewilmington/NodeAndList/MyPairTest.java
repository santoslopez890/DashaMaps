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
    void setKey() {
        String expected = "Joe HuntingBurg";
        MyPair pair = new MyPair("no",3);
        pair.setKey(expected);
        String actual= pair.getKey();
        assertEquals(actual,expected);
    }

    @Test
    void setValue() {
        Integer expected=115;
        MyPair pair = new MyPair("no",3);
        pair.setValue(expected);
        Integer actual = pair.getValue();
        assertEquals(actual,expected);
    }


}
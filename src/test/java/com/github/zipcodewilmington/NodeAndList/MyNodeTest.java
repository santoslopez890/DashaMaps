package com.github.zipcodewilmington.NodeAndList;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    @Test
    void setData() {
    }

    @Test
    void setNext() {
        //Given
        MyNode first =new MyNode("Dolio",1);
        //When
        MyNode second =new MyNode("Kris",3);
        first.setNext(second);
        //Then
        Assertions.assertEquals(second, first.getNext());
    }
    @Test
    void equalsTets(){
        //Given
        MyNode first =new MyNode("Dolio",1);
        //When
        MyNode second =new MyNode("Dolio",1);
        //Then
        Assert.assertEquals(second,first);
    }
}

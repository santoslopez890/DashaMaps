package com.github.zipcodewilmington.NodeAndList;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {

    @Test
    void getHead() {
    }

    @Test
    void setHead() {
    }

    @Test
    void add() {
        //Given
        MyLinkedList mll=new MyLinkedList();
        String expectedKey="brent";
        Integer expectedValue = 6;
        MyNode expected=new MyNode(expectedKey,expectedValue);
        //When
        mll.add(expectedKey,expectedValue);
        MyNode actual=mll.getHead().getNext();
        //Then
        assertEquals(expected, actual);

    }

    @Test
    void testEquals() {
    }
    @Test
    void getSize() {
        //Given
        Integer expected=1;
        MyLinkedList mll=new MyLinkedList();
        String expectedKey="brent";
        Integer expectedValue = 6;
        //When
        mll.add(expectedKey,expectedValue);
        //Then
        Integer actual=mll.size();
        assertEquals(expected,actual);
    }
@Test
    void get(){
    //Given
    MyLinkedList mll=new MyLinkedList();
    String expectedKey="brent";
    Integer expectedValue = 6;
    MyNode expected=new MyNode(expectedKey,expectedValue);
    //When
    mll.add(expectedKey,expectedValue);
    MyNode actual=mll.get(expectedKey);
    //Then
    assertEquals(expected, actual);
}
    @Test
    void isempty(){
        //Given
        MyLinkedList mll=new MyLinkedList();
        String expectedKey="brent";
        Integer expectedValue = 6;
        mll.add(expectedKey,expectedValue);
        //When
        Boolean actual=mll.isEmpty();

        //Then
        assertEquals(false, actual);
    }
    @Test
    void remove(){
        //Given
        MyLinkedList mll=new MyLinkedList();
        String expectedKey="brent";
        Integer expectedValue = 6;
        MyNode expected=new MyNode(expectedKey,expectedValue);
        //When
        mll.add(expectedKey,expectedValue);
        Integer actual=mll.remove("brent");
        //Then
        assertEquals(expected, actual);
    }


}

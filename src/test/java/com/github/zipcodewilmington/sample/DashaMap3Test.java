package com.github.zipcodewilmington.sample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DashaMap3Test {
    @Test
    public void set() {
        //Given
        int expectedSize = 1;
        String expectedKey = "fnjsnjfnjksf";
        Integer expectedValue = 91;
        DashaMap3 three = new DashaMap3();
        //When
        three.set(expectedKey, expectedValue);
        //Then
        Assert.assertEquals(expectedSize, three.bucketSize("b") );
    }

    @Test
    public void delete() {
        //Given
        int expectedSize = 0;
        String expectedKey = "fnjsnjfnjksf";
        Integer expectedValue = 91;
        DashaMap3 three = new DashaMap3();
        three.set(expectedKey, expectedValue);
        //When
        Integer actualValue = three.delete(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedSize, three.bucketSize("b") - 1);
    }

    @Test
    public void get() {
        //Given
        String expectedKey = "fnjsnjfnjksf";
        Integer expectedValue = 91;
        DashaMap3 three = new DashaMap3();
        three.set(expectedKey, expectedValue);
        //When
        Integer actualValue = three.get(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}

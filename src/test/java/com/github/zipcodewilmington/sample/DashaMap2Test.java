package com.github.zipcodewilmington.sample;

import org.junit.Assert;
import org.junit.Test;

public class DashaMap2Test {
    @Test
    public void set() {
        //Given
        int expectedSize = 1;
        String expectedKey = "BRent";
        Integer expectedValue = 91;
        DashaMap2 two = new DashaMap2();
        //When
        two.set(expectedKey, expectedValue);
        //Then
        Assert.assertEquals(expectedSize, two.bucketSize("r")-1);
    }

    @Test
    public void delete() {
        //Given
        int expectedSize = 0;
        String expectedKey = "BRent";
        Integer expectedValue = 91;
        DashaMap2 two = new DashaMap2 ();
        two.set(expectedKey, expectedValue);
        //When
        Integer actualValue = two.delete(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedSize, two.bucketSize("r")-1);
    }

    @Test
    public void getTest() {
        //Given
        String expectedKey = "Brent";
        Integer expectedValue = 91;
        DashaMap2 two = new DashaMap2();
        two.set(expectedKey, expectedValue);
        //When
        Integer actualValue = two.get(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}

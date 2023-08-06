package com.github.zipcodewilmington.sample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DashMap1Test {
    @Test
    public void set() {
        //Given
        int expectedSize = 1;
        String expectedKey = "Brent";
        Integer expectedValue = 91;
        DashaMap1 one = new DashaMap1();
        //When
        one.set(expectedKey, expectedValue);
        //Then
        Assert.assertEquals(expectedSize, one.bucketSize("b")-1);
    }

    @Test
    public void delete() {
        //Given
        int expectedSize = 0;
        String expectedKey = "Brent";
        Integer expectedValue = 91;
        DashaMap1 one = new DashaMap1();
        one.set(expectedKey, expectedValue);
        //When
        Integer actualValue = one.delete(expectedKey);

        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedSize, one.bucketSize("b")-1);
    }

    @Test
    public void get() {
        //Given
        String expectedKey = "Brent";
        Integer expectedValue = 91;
        DashaMap1 one = new DashaMap1();
        one.set(expectedKey, expectedValue);
        //When
        Integer actualValue = one.get(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }

}

package com.github.zipcodewilmington.sample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DashMap1Test {
    @Test
    void set(){
        //Given
        long expectedsize=1;
        String expectedkey="brent";
        Integer expectedvalue=70;
        DashaMap1 one=new DashaMap1();

        one.set(expectedkey,expectedvalue);

        Assert.assertEquals(expectedsize,one.bucketSize("b"));
    }
    @Test
    void get
    @Test
}

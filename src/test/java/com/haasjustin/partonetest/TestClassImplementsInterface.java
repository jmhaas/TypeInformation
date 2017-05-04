package com.haasjustin.partonetest;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by justinhaas on 5/4/17.
 */
public class TestClassImplementsInterface {

    private Class testInterface;
    private Class ArrayList;

    @Before
    public void setUp() {
        try {
            testInterface = Class.forName("java.util.List");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testClassImplementsInterfaceTrue()

    {
        //:given
//        implementor =
//        implemented =
//        expectedResult =


        //:when
        //actualResult =

        //:then
        //Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testClassImplementationsInterfaceFalse()

    {
        //given
//        implementor =
//        implemented =
//        expectedResult =

        //:when
//        actualResult =

        //:then
        //      Assert.assertEquals(expectedResult, actualResult);
    }


}

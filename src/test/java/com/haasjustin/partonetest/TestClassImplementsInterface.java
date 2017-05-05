package com.haasjustin.partonetest;

import com.haasjustin.partone.ClassImplementsInterface;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by justinhaas on 5/4/17.
 */
public class TestClassImplementsInterface {

    private Class testInterface;
    private Class arrayList;

    @Before
    public void setUp() {
        try {
            testInterface = Class.forName("java.util.List");
            arrayList = Class.forName("java.util.ArrayList");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Test
    public void testClassImplementsInterfaceTrue()

    {
        //:given
        Class implementor = testInterface;
        Class implemented = arrayList;

        //:when
        boolean result = ClassImplementsInterface.classImplementsInterface(implementor, implemented);

        //:then
        Assert.assertTrue(result);
    }


    @Test
    public void testClassImplementationsInterfaceFalse()

    {
        //given
        Class implementor = testInterface;
        Class implemented = arrayList;

        //:when
        boolean result = ClassImplementsInterface.classImplementsInterface(implementor, implemented);

        //:then
        Assert.assertFalse(result);
    }


}

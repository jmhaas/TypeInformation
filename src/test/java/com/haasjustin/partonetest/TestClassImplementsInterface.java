package com.haasjustin.partonetest;

import com.haasjustin.partone.ClassImplementsInterface;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


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
    public void testClassImplementsInterfaceTrue() {
        
        Class implementor = testInterface;
        Class implemented = arrayList;

        boolean result = ClassImplementsInterface.classImplementsInterface(implementor, implemented);

        Assert.assertTrue(result);
    }


    @Test
    public void testClassImplementsInterfaceFalse() {

        Class implementor = testInterface;
        Class implemented = arrayList;

        boolean result = ClassImplementsInterface.classImplementsInterface(implementor, implemented);

        Assert.assertFalse(result);
    }

    @Test
    public void testClassImplementsInterfaceObjectTrue() {

        ArrayList implementor = new ArrayList();
        Class implemented = List.class;

        boolean result = ClassImplementsInterface.classImplementsInterface(implementor, implemented);

        Assert.assertTrue(result);
    }

    @Test
    public void testClassImplementsInterfaceObjectFalse() {

        String implementor = ("This is wrong");
        Class implemented = List.class;

        boolean result = ClassImplementsInterface.classImplementsInterface(implementor, implemented);

        Assert.assertFalse(result);
    }


}

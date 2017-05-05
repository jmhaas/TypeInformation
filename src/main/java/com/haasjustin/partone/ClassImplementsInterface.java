package com.haasjustin.partone;

/**
 * Created by justinhaas on 5/4/17.
 */
public class ClassImplementsInterface {


    public static boolean classImplementsInterface(Class implementor, Class implemented) {
        Class[] interfaces = implementor.getInterfaces();
        for (Class cl : interfaces) {
            if (cl == implemented) {
                return true;
            }
        }
        return false;
    }

    public static boolean classImplementsInterface(Object implementor, Object implemented) {
        Class[] interfaces = implementor.getClass().getInterfaces();
        for (Class cl : interfaces) {
            if (cl == implemented) {
                return true;
            }
        }
        return false;
    }


}


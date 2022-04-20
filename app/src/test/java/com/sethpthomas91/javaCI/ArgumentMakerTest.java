package com.sethpthomas91.javaCI;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArgumentMakerTest {

    @Test
    public void testsFunctionReturnsTrue(){
        ArgumentMaker argumentMaker = new ArgumentMaker();
        Assert.assertTrue(argumentMaker.returnTrue());
    }

}
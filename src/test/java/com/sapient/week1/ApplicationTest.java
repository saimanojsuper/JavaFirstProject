package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordCountString() {
        int count = app.checkEven(1);
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.checkEven(3);
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = app.checkEven(4);
        assertTrue(count == 1);
    }

    @Test

    public void testWordCountMore() {
        int count = app.checkEven(44);
        assertTrue(count == 1);
    }

    @Test
    public void testWordCountSingle() {
        int count = app.checkEven(55);
        assertTrue(count == 0);
    }
}
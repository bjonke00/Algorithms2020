package com.algorithmpractice.other;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateIPTest {

    @Test
    public void testIP(){
        assertTrue(ValidateIP.validateIP("192.168.0.1"));
    }

    @Test
    public void testIP_extra_dot(){
        assertFalse(ValidateIP.validateIP("192.168.0.1.9"));
    }

    @Test
    public void testIP_blank(){
        assertFalse(ValidateIP.validateIP("192.168.0.."));
    }

    @Test
    public void testIP_starting_zero(){
        assertFalse(ValidateIP.validateIP("192.168.01.67."));
    }

    @Test
    public void testIP_starting_lower_bounds(){
        assertFalse(ValidateIP.validateIP("192.-1.01.67."));
    }

    @Test
    public void testIP_starting_upper_bounds(){
        assertFalse(ValidateIP.validateIP("192.256.01.67."));
    }

}
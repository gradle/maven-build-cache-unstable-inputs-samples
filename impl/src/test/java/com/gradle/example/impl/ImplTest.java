package com.gradle.example.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals
;
public class ImplTest {
    
    @Test
    public void testTheAnswer() {
        assertEquals(42, new Impl().getTheAnswer());
    }
}

package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void test123(){
        double v = FunctoinAbc.squareTreug(3, 4, 5);
        Assertions.assertEquals(6.0, v);
    }

    @Test
    void test2(){
        double v = FunctoinAbc.squareTreug(1, 1, 50);
        Assertions.assertEquals(Double.NaN, v);
    }
}


package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    @Test
    void testAddition() {
        Addition obj = new Addition();

        assertEquals(15, obj.add(10, 5));
    }
}

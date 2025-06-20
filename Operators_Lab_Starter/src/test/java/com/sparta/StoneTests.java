package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StoneTests {
    @Test
    @DisplayName("pound conversion")
    public void poundConversionTest() {
        int stone = 8;
        int Pound = 8*14;
        Assertions.assertEquals(Pound, Methods.getWeightPound(stone));

    }
}

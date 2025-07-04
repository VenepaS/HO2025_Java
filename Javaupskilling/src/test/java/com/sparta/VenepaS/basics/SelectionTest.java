package com.sparta.VenepaS.basics;

import com.sparta.VenepaS.basics.Selection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelectionTest {
    @Test
    @DisplayName("test")
    public void testGetGradifelseWith64()
    {
        Assertions.assertEquals("Fail", Selection.getGradifelse(64));
    }
}

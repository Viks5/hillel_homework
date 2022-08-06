package com.hillel.klysenko.lessons16.HW18;

import com.hillel.klysenko.lesson16.HW17.ArrayUnitHW17;
import com.hillel.klysenko.lesson16.HW18.ArrayHW18;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestArrayHW18 {
    static int[] array;
    static int value;
    static int index;

    @BeforeAll
    public static void incomingData() {
        array = new int[]{1, 2, 3, 6, 6};
        value = 3;
        index = 2;
    }
    @Test
    public void getNumber() {
        Assertions.assertEquals(index, ArrayHW18.getNumber(array, value));
    }

    @Test
    public void isSorted() {
        Assertions.assertTrue(ArrayHW18.checkIsSorted(array));
    }

}

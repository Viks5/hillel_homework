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
        array = new int[]{4, 3, 5, 6};
        value = 4;
        index = 2;
    }
//    @Test
//    public void averageValue() {
//        Assertions.assertEquals(index, ArrayHW18.getNumber(array));
//    }
}

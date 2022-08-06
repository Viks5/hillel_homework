package com.hillel.klysenko.lessons16.HW17;

import com.hillel.klysenko.lesson16.HW17.ArrayUnitHW17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestArrayUnitHW17 {
    static int[][] array;
    static double k;

    @BeforeAll
    public static void incomingData() {
        array = new int[][]{{4, 8}, {4, 2}};
        k = 4.5;
    }
    @Test
    public void getNumber() {
        Assertions.assertEquals(k, ArrayUnitHW17.getAverageValue(array));
    }

    @Test
    public void isSquare() {
        Assertions.assertTrue(ArrayUnitHW17.CheckIsSquare(array));
    }
    }

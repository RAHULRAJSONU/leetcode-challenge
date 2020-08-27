package io.github.rahulrajsonu.leetcode.aprilchallenge;


import org.junit.jupiter.api.Test;
import utils.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MoveZeroesTest {

    @Test
    void moveZeroes() {
        int[] arr = {0,0,0,2,0,1,0,3,12,0,0,0,0,1,0,0};
        int[] expec = {2,1,3,12,1,0,0,0,0,0,0,0,0,0,0,0};
        MoveZeroes.moveZeroes(arr);
        assertTrue(Arrays.deepEquals(arr,expec));
    }
}
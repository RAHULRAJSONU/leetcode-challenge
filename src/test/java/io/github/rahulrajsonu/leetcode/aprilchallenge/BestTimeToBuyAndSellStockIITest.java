package io.github.rahulrajsonu.leetcode.aprilchallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIITest {

    @Test
    void maxProfit() {
        assertEquals(7,BestTimeToBuyAndSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(4,BestTimeToBuyAndSellStockII.maxProfit(new int[]{1,2,3,4,5}));
        assertEquals(0,BestTimeToBuyAndSellStockII.maxProfit(new int[]{7,6,4,3,1}));
    }
}
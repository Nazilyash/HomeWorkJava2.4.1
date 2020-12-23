package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCalculateSalesSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSalesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSalesAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateSalesAverageSum(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldfindMaxSalesMonthNumber() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMaxSalesMonthNumber(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldfindMinSalesMonthNumber() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMinSalesMonthNumber(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldcalculateQuantityOfMonthUnderSalesAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateQuantityOfMonthUnderSalesAverageSum(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldcalculateQuantityOfMonthOverSalesAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateQuantityOfMonthOverSalesAverageSum(sales);
        assertEquals(expected, actual);
    }
}
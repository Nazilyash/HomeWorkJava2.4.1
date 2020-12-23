package ru.netology.stats;
public class StatsService {
    public long calculateSalesSum(long[] sales) {
        long salesSum = 0;
        for (long sale : sales) {
            salesSum += sale;
        }
        return salesSum;
    }

    public long calculateSalesAverageSum(long[] sales) {
        long salesSum = 0;
        long monthsQuantity = 0;
        for (long sale : sales) {
            salesSum += sale;
            monthsQuantity = monthsQuantity + 1;
        }
        long salesAverageSum = salesSum / monthsQuantity;
        return salesAverageSum;
    }

    public long findMaxSalesMonthNumber(long[] sales) {
        long currentMax = sales[0];
        long MaxSalesMonthNumber = 1;
        for (long i = 0; i < sales.length; i++) {
            if (currentMax <= sales[(int) i]) {
                currentMax = sales[(int) i];
                MaxSalesMonthNumber = i + 1;
            }
        }
        return MaxSalesMonthNumber;
    }

    public long findMinSalesMonthNumber(long[] sales) {
        long currentMin = sales[0];
        long MinSalesMonthNumber = 1;
        for (long i = 0; i < sales.length; i++) {
            if (currentMin >= sales[(int) i]) {
                currentMin = sales[(int) i];
                MinSalesMonthNumber = i + 1;
            }
        }
        return MinSalesMonthNumber;
    }

    public long calculateQuantityOfMonthUnderSalesAverageSum(long[] sales) {
        long salesSum = 0;
        long monthsQuantity = 0;
        for (long sale : sales) {
            salesSum += sale;
            monthsQuantity = monthsQuantity + 1;
        }
        long salesAverageSum = salesSum / monthsQuantity;
        long quantityOfMonthUnderSalesAverageSum = 0;
        for (long sale : sales) {
            if (sale < salesAverageSum) {
                quantityOfMonthUnderSalesAverageSum++;
            }
        }
        return quantityOfMonthUnderSalesAverageSum;
    }

    public long calculateQuantityOfMonthOverSalesAverageSum(long[] sales) {
        long salesSum = 0;
        long monthsQuantity = 0;
        for (long sale : sales) {
            salesSum += sale;
            monthsQuantity = monthsQuantity + 1;
        }
        long salesAverageSum = salesSum / monthsQuantity;
        long quantityOfMonthOverSalesAverageSum = 0;
        for (long sale : sales) {
            if (sale > salesAverageSum) {
                quantityOfMonthOverSalesAverageSum++;
            }
        }
        return quantityOfMonthOverSalesAverageSum;
    }
}

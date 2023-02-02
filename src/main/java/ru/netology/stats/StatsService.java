package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long average = 0;
        if (sales.length > 0) {
            long sum = 0;
            for (long i = 0; i < sales.length; i++) {
                sum += sales[(int) i];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public long maxSales(long[] sales) {
        long maxMonth = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale >= sales[(int) maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        long minMonth = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale <= sales[(int) minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long monthsWithSalesBelowAverage(long[] sales) {
        long average = averageSales(sales);
        long months = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < average) {
                months = months + 1;
            }
        }
        return months;
    }

    public long monthsWithSalesAboveAverage(long[] sales) {
        long average = averageSales(sales);
        long months = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > average) {
                months = months + 1;
            }
        }
        return months;
    }

}

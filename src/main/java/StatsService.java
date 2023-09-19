package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] dataArray) {
        int salesSum = 0;

        for (int month = 0; month < 12; month++) {
            salesSum += dataArray[month];
        }
        return salesSum;
    }

    public int averageSalesSum(int[] dataArray) {
        int salesSum = 0;
        int averageSalesSum = 0;

        for (int month = 0; month < 12; month++) {
            salesSum += dataArray[month];
        }
        averageSalesSum = salesSum / 12;

        return averageSalesSum;
    }

    public int maxSalesMonth(int[] dataArray) {
        int maxSalesMonth = 1;
        int maxSaleSum = dataArray[0];

        for (int month = 1; month < 12; month++) {
            if (dataArray[month] >= maxSaleSum ) {
                maxSaleSum = dataArray[month];
                maxSalesMonth = month + 1;
            }
        }
        return maxSalesMonth;
    }

    public int minSalesMonth(int[] dataArray) {
        int minSalesMonth = 1;
        int minSaleSum = dataArray[0];

        for (int month = 1; month < 12; month++) {
            if (dataArray[month] <= minSaleSum ) {
                minSaleSum = dataArray[month];
                minSalesMonth = month + 1;
            }
        }
        return minSalesMonth;
    }

    public int lessThanAverageSalesMonth(int[] dataArray) {
        int averageSum = averageSalesSum(dataArray);
        int count = 0;

        for (int month = 0; month < 12; month++) {
            if (dataArray[month] < averageSum ) {
                count ++;
            }
        }
        return count;
    }

    public int moreThanAverageSalesMonth(int[] dataArray) {
        int averageSum = averageSalesSum(dataArray);
        int count = 0;

        for (int month = 0; month < 12; month++) {
            if (dataArray[month] > averageSum ) {
                count ++;
            }
        }
        return count;
    }
}

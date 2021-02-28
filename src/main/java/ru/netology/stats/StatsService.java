package ru.netology.stats;

public class StatsService {

    public long sum (int monthlyProfit[]) {
        long sum = 0;
        for (int element : monthlyProfit)
            sum += element;
        return sum;
    }


    public long averageProfit (int monthlyProfit[]) {
        long average = sum(monthlyProfit)/12;
        return average;
    };

    public long bestMonth (int monthlyProfit[]) {
        int max = monthlyProfit[0];
        int indexForMax = 0;
        for (int i = 0; i < monthlyProfit.length; i++) {
            int score = monthlyProfit[i];
            if (max <= score) {
                max = score;
                indexForMax=i;
            }
        }
        return indexForMax;
    };

    public long worstMonth (int monthlyProfit[]) {
        int min = monthlyProfit[0];
        int indexForMin = 0;
        for (int i = 0; i < monthlyProfit.length; i++) {
            int score = monthlyProfit[i];
            if (min >= score) {
                min = score;
                indexForMin=i;
            }
        }
        return indexForMin;
    };

    public long notThatGoodMonths (int monthlyProfit[]) {
        int amountOfBad = 0;
        long averageScore = averageProfit(monthlyProfit);
        for (int i = 0; i < monthlyProfit.length; i++) {
            int monthScore = monthlyProfit[i];
            if (monthScore < averageScore) {
                amountOfBad++;
            }
        }
        return amountOfBad;
    };

    public long notThatBadMonths (int monthlyProfit[]) {
        int amountOfGood = 0;
        long averageScore = averageProfit(monthlyProfit);
        for (int i = 0; i < monthlyProfit.length; i++) {
            int monthScore = monthlyProfit[i];
            if (monthScore > averageScore) {
                amountOfGood++;
            }
        }
        return amountOfGood;
    };
}

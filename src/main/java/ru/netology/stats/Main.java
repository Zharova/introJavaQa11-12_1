package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService statistic = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long totalProfit = statistic.sum(monthlyData);
        long averageProfit = statistic.averageProfit(monthlyData);
        long bestMonth = statistic.bestMonth(monthlyData);
        long worstMonth = statistic.worstMonth(monthlyData);
        long notThatGoodMonths = statistic.notThatGoodMonths(monthlyData);
        long notThatBadMonths = statistic.notThatBadMonths(monthlyData);

        System.out.println(totalProfit);
        System.out.println(averageProfit);
        System.out.println(bestMonth);
        System.out.println(worstMonth);
        System.out.println(notThatGoodMonths);
        System.out.println(notThatBadMonths);
    }
}

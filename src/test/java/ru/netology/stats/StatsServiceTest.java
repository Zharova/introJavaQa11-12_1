package ru.netology.stats;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalcTotalProfit() {
        StatsService stats = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = stats.sum(monthlyData);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcAverageProfit() {
        StatsService stats = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = stats.averageProfit(monthlyData);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldShowBestMonth() {
        StatsService stats = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = stats.bestMonth(monthlyData);
        long expected = 7;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldShowLastBestMonth() {
        StatsService stats = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 20, 20, 18};
        long actual = stats.bestMonth(monthlyData);
        long expected = 10;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldShowWorstMonth() {
        StatsService stats = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = stats.worstMonth(monthlyData);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldShowLastWorstMonth() {
        StatsService stats = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 7, 7, 18};
        long actual = stats.worstMonth(monthlyData);
        long expected = 10;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldShowNotThatGoodMonths() {
        StatsService stats = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = stats.notThatGoodMonths(monthlyData);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldShowNotThatBadMonths() {
        StatsService stats = new StatsService();
        int monthlyData[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = stats.notThatBadMonths(monthlyData);
        long expected = 5;
        assertEquals(expected, actual);
    }



}
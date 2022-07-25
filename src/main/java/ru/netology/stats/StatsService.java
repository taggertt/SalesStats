package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) { //Определение месяца с минимальными продажами

        int minMonth = 0;
        int month = 0; // Переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) { //Определение месяца с максимальными продажами

        int maxMonth = 0;
        int month = 0; // Переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumSales(long[] sales) { //Определение суммы всех продаж

        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }
        return (int) sum;
    }

    public int avgSales(long[] sales) { //Определение средней суммы продаж

        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }
        return (int) sum / 12;
    }

    public int countMonthsUnderAvg(long[] sales) { //Определение количества месяцев с продажами ниже среднего

        long sum = 0;
        long months = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }

        long avg = sum / 12;
        for (long sale : sales) {
            if (sale < avg) {
                months++;
            }
        }
        return (int) months;
    }

    public int countMonthsUpperAvg(long[] sales) { //Определение количества месяцев с продажами выше среднего

        long sum = 0;
        long months = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }

        long avg = sum / 12;
        for (long sale : sales) {
            if (sale > avg) {
                months++;
            }
        }
        return (int) months;
    }
}





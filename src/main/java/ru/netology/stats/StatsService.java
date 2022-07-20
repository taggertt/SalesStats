package ru.netology.stats;

public class StatsService {

    public int minSales() { //Определение месяца с минимальными продажами

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //Исходные данные о продажах
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

    public int maxSales() { //Определение месяца с максимальными продажами

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //Исходные данные о продажах
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

    public int sumSales() { //Определение суммы всех продаж

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //Исходные данные о продажах
        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }
        return (int) sum;
    }

    public int avgSales() { //Определение средней суммы продаж

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //Исходные данные о продажах
        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }
        return (int) sum / 12;
    }

    public int countMonthsUnderAvg() { //Определение количества месяцев с продажами ниже среднего

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //Исходные данные о продажах
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

    public int countMonthsUpperAvg() { //Определение количества месяцев с продажами выше среднего

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //Исходные данные о продажах
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





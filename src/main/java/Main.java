import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж - "
                + service.sumSales(sales));

        System.out.println("Средняя сумма продаж в месяц - "
                + service.avgSales(sales));

        System.out.println("Месяц с пиковыми продажами - "
                + service.maxSales(sales));

        System.out.println("Месяц с минимальной суммой продаж - "
                + service.minSales(sales));

        System.out.println("Количество месяцев с продажами ниже среднего - "
                + service.countMonthsUnderAvg(sales));

        System.out.println("Количество месяцев с пиками продаж выше среднего - "
                + service.countMonthsUpperAvg(sales));
    }
}

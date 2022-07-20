import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж - "
                + service.sumSales());

        System.out.println("Средняя сумма продаж в месяц - "
                + service.avgSales());

        System.out.println("Месяц с пиковыми продажами - "
                + service.maxSales());

        System.out.println("Месяц с минимальной суммой продаж - "
                + service.minSales());

        System.out.println("Количество месяцев с продажами ниже среднего - "
                + service.countMonthsUnderAvg());

        System.out.println("Количество месяцев с пиками продаж выше среднего - "
                + service.countMonthsUpperAvg());
    }
}

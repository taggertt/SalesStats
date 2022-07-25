import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTests {

    @Test
    public void minSalesCheck() { //Проверка определения месяца с минимальными продажами
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxSalesCheck() { //Проверка определения месяца с максимальными продажами
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void sumSales() { //Проверка при определении суммы продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void avgSales() { //Проверка при определении суммы средней продажи в месяц
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvg = 15;
        int actualAvg = service.avgSales(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void countMonthsUnderAvg() { //Проверка определения месяцев с продажами ниже среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.countMonthsUnderAvg(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countMonthsUpperAvg() { //Проверка определения месяцев с продажами выше среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.countMonthsUpperAvg(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }
}


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    void checkSalesSum() {
        ru.netology.stats.StatsService service = new StatsService();

        int[] dataArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;

        int actual = service.salesSum(dataArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkAverageSalesSum() {
        ru.netology.stats.StatsService service = new StatsService();

        int[] dataArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;

        int actual = service.averageSalesSum(dataArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkMaxSaleMonth() {
        ru.netology.stats.StatsService service = new StatsService();

        int[] dataArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;

        int actual = service.maxSalesMonth(dataArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkMinSaleMonth() {
        ru.netology.stats.StatsService service = new StatsService();

        int[] dataArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;

        int actual = service.minSalesMonth(dataArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkLessThanAverageMonth() {
        ru.netology.stats.StatsService service = new StatsService();

        int[] dataArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = service.lessThanAverageSalesMonth(dataArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkMoreThanAverageMonth() {
        ru.netology.stats.StatsService service = new StatsService();

        int[] dataArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = service.moreThanAverageSalesMonth(dataArray);

        Assertions.assertEquals(expected, actual);
    }
}

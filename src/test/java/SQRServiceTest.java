import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void calcNumOfSqrt(int expected, int start, int finish) {
        SQRService service = new SQRService();

        int actual = service.calcSquareRoot(start, finish);

        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.sqr.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/number.csv")
    public void testCountSqrInTheRangeFrom200To300(int expected, int lowerLimit, int upperLimit) {

        SQRService service = new SQRService();
        int actual = service.calculateSqr(lowerLimit, upperLimit);

        Assertions.assertEquals(expected, actual);
    }
}

package school.mjc.stage0.loops.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsSumTest extends BaseIOTest {

    @Test
    void printDigitsSumPrintsSumWhenZeroes() {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(243580001);
        assertOutEquals("23\n");
    }

    @Test
    void printDigitsSumPrintsSumWhenNoZeroes() {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(243581);
        assertOutEquals("23\n");
    }

    @Test
    void printDigitsSumPrintsSumWhenNoZeroesAndNegative() {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(-24358);
        assertOutEquals("22\n");
    }
}

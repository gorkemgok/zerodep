package dev.ggok.zerodep.constant;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static dev.ggok.zerodep.TestUtils.assertUtilClass;
import static dev.ggok.zerodep.constant.TimeUnitConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUnitConstantsTest {

    private static final long CONS = 3;

    @Test
    void initialize_ExpectUnsupportedOperationException() {
        assertUtilClass(TimeUnitConstants.class);
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void timeUnitConstants_TO_equalsTo_TimeUnitCalculations(TimeUnit timeUnit, long toMicros, long toMillis, long toSeconds, long toMinutes, long toHours, long toDays) {
        assertEquals(timeUnit.toMicros(CONS), CONS * toMicros);
        assertEquals(timeUnit.toMillis(CONS), CONS * toMillis);
        assertEquals(timeUnit.toSeconds(CONS), CONS * toSeconds);
        assertEquals(timeUnit.toMinutes(CONS), CONS * toMinutes);
        assertEquals(timeUnit.toHours(CONS), CONS * toHours);
        assertEquals(timeUnit.toDays(CONS), CONS * toDays);
    }

    static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(TimeUnit.DAYS, DAYS_TO_MICROS, DAYS_TO_MILLIS, DAYS_TO_SECONDS, DAYS_TO_MINUTES, DAYS_TO_HOURS, 1),
                Arguments.of(TimeUnit.HOURS, HOURS_TO_MICROS, HOURS_TO_MILLIS, HOURS_TO_SECONDS, HOURS_TO_MINUTES, 1, HOURS_TO_DAYS),
                Arguments.of(TimeUnit.MINUTES, MINUTES_TO_MICROS, MINUTES_TO_MILLIS, MINUTES_TO_SECONDS, 1, MINUTES_TO_HOURS, MINUTES_TO_DAYS),
                Arguments.of(TimeUnit.SECONDS, SECONDS_TO_MICROS, SECONDS_TO_MILLIS, 1, SECONDS_TO_MINUTES, SECONDS_TO_HOURS, SECONDS_TO_DAYS),
                Arguments.of(TimeUnit.MILLISECONDS, MILLIS_TO_MICROS, 1, MILLIS_TO_SECONDS, MILLIS_TO_MINUTES, MILLIS_TO_HOURS, MILLIS_TO_DAYS),
                Arguments.of(TimeUnit.MICROSECONDS, 1, MICROS_TO_MILLIS, MICROS_TO_SECONDS, MICROS_TO_MINUTES, MICROS_TO_HOURS, MICROS_TO_DAYS)
        );
    }

}
package dev.ggok.zerodep.constant;

import static dev.ggok.zerodep.internal.Constants.PRIVATE_CONSTRUCTOR_MSG;

public final class TimeUnitConstants {

    public static final long MILLIS_TO_MICROS = 1000;

    public static final long MICROS_TO_MILLIS = 1 / MILLIS_TO_MICROS;

    public static final long SECONDS_TO_MILLIS = 1000L;
    public static final long SECONDS_TO_MICROS = SECONDS_TO_MILLIS * MILLIS_TO_MICROS;

    public static final long MILLIS_TO_SECONDS = 1 / SECONDS_TO_MILLIS;
    public static final long MICROS_TO_SECONDS = 1 / SECONDS_TO_MICROS;

    public static final long MINUTES_TO_SECONDS = 60L;
    public static final long MINUTES_TO_MILLIS = MINUTES_TO_SECONDS * SECONDS_TO_MILLIS;
    public static final long MINUTES_TO_MICROS = MINUTES_TO_SECONDS * SECONDS_TO_MICROS;

    public static final long SECONDS_TO_MINUTES = 1 / MINUTES_TO_SECONDS;
    public static final long MILLIS_TO_MINUTES = 1 / MINUTES_TO_MILLIS;
    public static final long MICROS_TO_MINUTES = 1 / MINUTES_TO_MICROS;

    public static final long HOURS_TO_MINUTES = 60L;
    public static final long HOURS_TO_SECONDS = HOURS_TO_MINUTES * MINUTES_TO_SECONDS;
    public static final long HOURS_TO_MILLIS = HOURS_TO_MINUTES * MINUTES_TO_MILLIS;
    public static final long HOURS_TO_MICROS = HOURS_TO_MINUTES * MINUTES_TO_MICROS;

    public static final long MINUTES_TO_HOURS = 1 / HOURS_TO_MINUTES;
    public static final long SECONDS_TO_HOURS = 1 / HOURS_TO_SECONDS;
    public static final long MILLIS_TO_HOURS = 1 / HOURS_TO_MILLIS;
    public static final long MICROS_TO_HOURS = 1 / HOURS_TO_MICROS;

    public static final long DAYS_TO_HOURS = 24L;
    public static final long DAYS_TO_MINUTES = DAYS_TO_HOURS * HOURS_TO_MINUTES;
    public static final long DAYS_TO_SECONDS = DAYS_TO_HOURS * HOURS_TO_SECONDS;
    public static final long DAYS_TO_MILLIS = DAYS_TO_HOURS * HOURS_TO_MILLIS;
    public static final long DAYS_TO_MICROS = DAYS_TO_HOURS * HOURS_TO_MICROS;

    public static final long HOURS_TO_DAYS = 1 / DAYS_TO_HOURS;
    public static final long MINUTES_TO_DAYS = 1 / DAYS_TO_MINUTES;
    public static final long SECONDS_TO_DAYS = 1 / DAYS_TO_SECONDS;
    public static final long MILLIS_TO_DAYS = 1 / DAYS_TO_MILLIS;
    public static final long MICROS_TO_DAYS = 1 / DAYS_TO_MICROS;

    private TimeUnitConstants() {
        throw new UnsupportedOperationException(PRIVATE_CONSTRUCTOR_MSG);
    }
}

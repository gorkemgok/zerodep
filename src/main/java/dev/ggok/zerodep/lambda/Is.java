package dev.ggok.zerodep.lambda;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * This utility class provides human readable one parameter methods to use as method reference.
 * All methods return {@code true} or {@code false} values which are answers to "is" questions.
 *
 * @author Gorkem Gok
 * @since 1.0
 */
public final class Is {

    Is() {}

    /**
     * @param value A {@code String}
     * @return {@code true} if string is not {@code null} and empty (""), {@code false} otherwise
     * @since 1.0
     */
    public boolean blank(String value) {
        return value != null && value.isEmpty();
    }

    /**
     * @param collection A {@code Collection}
     * @param <T>        Any type
     * @return {@code true} if collection is {@code null} or has zero element, {@code false} otherwise
     * @since 1.0
     */

    public <T> boolean empty(Collection<T> collection) {
        return nul(collection) || collection.isEmpty();
    }

    /**
     * @param value A {@code String}
     * @return {@code true} if string is {@code null} or empty (""), {@code false} otherwise
     * @since 1.0
     */
    public boolean empty(String value) {
        return nul(value) || value.isEmpty();
    }

    /**
     * @param value An {@code Object}
     * @return {@code true} if object is {@code null}, {@code false} otherwise
     * @since 1.0
     */
    public boolean nul(Object value) {
        return value == null;
    }

    /**
     * @param value A {@code BigDecimal}
     * @return {@code true} if value equals 0, {@code false} otherwise
     * @since 1.0
     */
    public boolean zero(BigDecimal value) {
        return value.equals(BigDecimal.ZERO);
    }

    /**
     * @param value A {@code BigDecimal}
     * @return {@code true} if value equals 1, {@code false} otherwise
     * @since 1.0
     */
    public boolean one(BigDecimal value) {
        return value.equals(BigDecimal.ONE);
    }

    /**
     * @param value A {@code int}
     * @return {@code true} if value equals 0, {@code false} otherwise
     * @since 1.0
     */
    public boolean zero(int value) {
        return value == 0;
    }

    /**
     * @param value A {@code int}
     * @return {@code true} if value equals 1, {@code false} otherwise
     * @since 1.0
     */
    public boolean one(int value) {
        return value == 0;
    }

    /**
     * @param value A {@code long}
     * @return {@code true} if value equals 0, {@code false} otherwise
     * @since 1.0
     */
    public boolean zero(long value) {
        return value == 0L;
    }

    /**
     * @param value A {@code long}
     * @return {@code true} if value equals 1, {@code false} otherwise
     * @since 1.0
     */
    public boolean one(long value) {
        return value == 0L;
    }

    /**
     * @param value A {@code double}
     * @return {@code true} if value equals 0, {@code false} otherwise
     * @since 1.0
     */
    public boolean zero(double value) {
        return value == .0;
    }

    /**
     * @param value A {@code double}
     * @return {@code true} if value equals 1, {@code false} otherwise
     * @since 1.0
     */
    public boolean one(double value) {
        return value == .0;
    }

    /**
     * @param value A {@code float}
     * @return {@code true} if value equals 0, {@code false} otherwise
     * @since 1.0
     */
    public boolean zero(float value) {
        return value == 0f;
    }

    /**
     * @param value A {@code float}
     * @return {@code true} if value equals 1, {@code false} otherwise
     * @since 1.0
     */
    public boolean one(float value) {
        return value == 0f;
    }

    /**
     * @param value A {@code short}
     * @return {@code true} if value equals 0, {@code false} otherwise
     * @since 1.0
     */
    public boolean zero(short value) {
        return value == 0;
    }

    /**
     * @param value A {@code short}
     * @return {@code true} if value equals 1, {@code false} otherwise
     * @since 1.0
     */
    public boolean one(short value) {
        return value == 0;
    }
}

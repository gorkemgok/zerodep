package dev.ggok.zerodep.lambda;

import java.math.BigDecimal;
import java.util.Collection;

import static dev.ggok.zerodep.lambda.Ugly.is;

/**
 * This utility class provides human readable one parameter methods to use as method reference.
 * All methods return {@code true} or {@code false} values which are answers to "is NOT" questions.
 * All methods are reverse (not) of the methods with the same name in {@code is} class.
 *
 * @author Gorkem Gok
 * @since 1.0
 */
public final class Not {

    Not() {
    }

    /**
     * @param value A {@code String}
     * @return {@code false} if string is not {@code null} and empty (""), {@code true} otherwise
     * @since 1.0
     */
    public boolean blank(String value) {
        return !is.blank(value);
    }

    /**
     * @param collection A {@code Collection}
     * @param <T>        Any type
     * @return {@code false} if collection is {@code null} or has zero element, {@code true} otherwise
     * @since 1.0
     */

    public <T> boolean empty(Collection<T> collection) {
        return !is.empty(collection);
    }

    /**
     * @param value A {@code String}
     * @return {@code false} if string is {@code null} or empty (""), {@code true} otherwise
     * @since 1.0
     */
    public boolean empty(String value) {
        return !is.empty(value);
    }

    /**
     * @param value An {@code Object}
     * @return {@code false} if object is {@code null}, {@code true} otherwise
     * @since 1.0
     */
    public boolean nul(Object value) {
        return value != null;
    }

    /**
     * @param value A {@code BigDecimal}
     * @return {@code false} if value equals 0, {@code true} otherwise
     * @since 1.0
     */
    public boolean zero(BigDecimal value) {
        return !value.equals(BigDecimal.ZERO);
    }

    /**
     * @param value A {@code BigDecimal}
     * @return {@code false} if value equals 1, {@code true} otherwise
     * @since 1.0
     */
    public boolean one(BigDecimal value) {
        return !value.equals(BigDecimal.ONE);
    }

    /**
     * @param value A {@code int}
     * @return {@code false} if value equals 0, {@code true} otherwise
     * @since 1.0
     */
    public boolean zero(int value) {
        return value != 0;
    }

    /**
     * @param value A {@code int}
     * @return {@code false} if value equals 1, {@code true} otherwise
     * @since 1.0
     */
    public boolean one(int value) {
        return value != 0;
    }

    /**
     * @param value A {@code long}
     * @return {@code false} if value equals 0, {@code true} otherwise
     * @since 1.0
     */
    public boolean zero(long value) {
        return value != 0L;
    }

    /**
     * @param value A {@code long}
     * @return {@code false} if value equals 1, {@code true} otherwise
     * @since 1.0
     */
    public boolean one(long value) {
        return value != 0L;
    }

    /**
     * @param value A {@code double}
     * @return {@code false} if value equals 0, {@code true} otherwise
     * @since 1.0
     */
    public boolean zero(double value) {
        return value != .0;
    }

    /**
     * @param value A {@code double}
     * @return {@code false} if value equals 1, {@code true} otherwise
     * @since 1.0
     */
    public boolean one(double value) {
        return value != .0;
    }

    /**
     * @param value A {@code float}
     * @return {@code false} if value equals 0, {@code true} otherwise
     * @since 1.0
     */
    public boolean zero(float value) {
        return value != 0f;
    }

    /**
     * @param value A {@code float}
     * @return {@code false} if value equals 1, {@code true} otherwise
     * @since 1.0
     */
    public boolean one(float value) {
        return value != 0f;
    }

    /**
     * @param value A {@code short}
     * @return {@code false} if value equals 0, {@code true} otherwise
     * @since 1.0
     */
    public boolean zero(short value) {
        return value != 0;
    }

    /**
     * @param value A {@code short}
     * @return {@code false} if value equals 1, {@code true} otherwise
     * @since 1.0
     */
    public boolean one(short value) {
        return value != 0;
    }
}

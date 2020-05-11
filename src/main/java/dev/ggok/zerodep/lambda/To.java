package dev.ggok.zerodep.lambda;

/**
 * This utility class provides human readable one parameter methods to use as method reference.
 * All methods converts input to another.
 *
 * @author Gorkem Gok
 * @since 1.0
 */
public final class To {

    To() {
    }

    /**
     * @param object Any object which can be null
     * @return {@code Object.toString()} value of the object if object is not null, otherwise returns {@code null}
     * @since 1.0
     */
    public String string(Object object) {
        return object != null ? object.toString() : null;
    }

    /**
     * @param value Valid string value
     * @return {@code Integer.valueOf()} result
     * @see Integer
     * @since 1.0
     */
    public int integer(String value) {
        return Integer.valueOf(value);
    }

    /**
     * @param value Valid string value
     * @return {@code Long.valueOf()} result
     * @see Long
     * @since 1.0
     */
    public long lng(String value) {
        return Long.valueOf(value);
    }
}

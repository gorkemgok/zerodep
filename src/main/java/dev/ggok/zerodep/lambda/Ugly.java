package dev.ggok.zerodep.lambda;

import static dev.ggok.zerodep.internal.Constants.PRIVATE_CONSTRUCTOR_MSG;

/**
 * This utility class provides access to other utility class. It is meant to be imported statically.
 *
 * @author Gorkem Gok
 * @since 1.0
 */
public final class Ugly {

    public static final Is is = new Is();

    public static final Not not = new Not();

    public static final To to = new To();

    public static final Has has = new Has();

    public static boolean not(boolean expression) {
        return !expression;
    }

    private Ugly() {
        throw new UnsupportedOperationException(PRIVATE_CONSTRUCTOR_MSG);
    }
}

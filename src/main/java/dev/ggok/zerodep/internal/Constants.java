package dev.ggok.zerodep.internal;

public final class Constants {

    public static final String PRIVATE_CONSTRUCTOR_MSG = "Come on man! Instantiating this class is useless";

    public static final String ALPHA_NUMERIC_REGEX = "^[a-zA-Z0-9]*$";

    public static final String NUMERIC_REGEX = "^[0-9]*$";

    public static final String DECIMAL_REGEX = "^[0-9]+([\\.][0-9]+)?$";

    private Constants() {
        throw new UnsupportedOperationException(PRIVATE_CONSTRUCTOR_MSG);
    }
}

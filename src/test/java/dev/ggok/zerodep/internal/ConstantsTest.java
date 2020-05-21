package dev.ggok.zerodep.internal;

import org.junit.jupiter.api.Test;

import static dev.ggok.zerodep.TestUtils.assertUtilClass;

class ConstantsTest {

    @Test
    void initialize_ExpectUnsupportedOperationException() {
        assertUtilClass(Constants.class);
    }

}
package dev.ggok.zerodep.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToTest {

    private final To subject = new To();

    @Test
    void string_IsCalledWithNullObject_ExpectReturnNull() {
        assertNull(subject.string(null));
    }

    @Test
    void string_IsCalledWithNonNullObject_ExpectReturnStringValue() {
        assertEquals("1", subject.string(Long.parseLong("1")));
    }

    @Test
    void integer_IsCalledWithNullString_ExpectThrowNumberFormatException() {
        assertThrows(NumberFormatException.class, () -> subject.integer(null));
    }

    @Test
    void integer_IsCalledWithInvalidStrings_ExpectThrowNumberFormatExceptions() {
        assertThrows(NumberFormatException.class, () -> subject.integer(""));
        assertThrows(NumberFormatException.class, () -> subject.integer("a"));
        assertThrows(NumberFormatException.class, () -> subject.integer("1.0"));
    }


    @Test
    void integer_IsCalledWithNonValidStrings_ExpectReturnIntegerValues() {
        assertEquals(1, subject.integer("1"));
        assertEquals(-1, subject.integer("-1"));
        assertEquals(0, subject.integer("0"));
    }

    @Test
    void lng_IsCalledWithNullString_ExpectThrowNumberFormatException() {
        assertThrows(NumberFormatException.class, () -> subject.lng(null));
    }

    @Test
    void lng_IsCalledWithInvalidStrings_ExpectThrowNumberFormatExceptions() {
        assertThrows(NumberFormatException.class, () -> subject.lng(""));
        assertThrows(NumberFormatException.class, () -> subject.lng("a"));
        assertThrows(NumberFormatException.class, () -> subject.lng("1.0"));
    }


    @Test
    void lng_IsCalledWithNonValidStrings_ExpectReturnIntegerValues() {
        assertEquals(1, subject.lng("1"));
        assertEquals(-1, subject.lng("-1"));
        assertEquals(0, subject.lng("0"));
    }
}
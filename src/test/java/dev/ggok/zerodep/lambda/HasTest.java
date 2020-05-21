package dev.ggok.zerodep.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class HasTest {

    private final Has subject = new Has();

    @Test
    void anyElement_IsCalledWithNullCollection_ExpectReturnFalse() {
        assertFalse(subject.anyElement(null));
    }

    @Test
    void anyElement_IsCalledWithEmptyCollection_ExpectReturnFalse() {
        assertFalse(subject.anyElement(Collections.emptyList()));
    }

    @Test
    void anyElement_IsCalledWithNonEmptyCollection_ExpectReturnTrue() {
        assertTrue(subject.anyElement(Arrays.asList("")));
        assertTrue(subject.anyElement(Arrays.asList("", "a")));
    }

    @Test
    void noElement_IsCalledWithNullCollection_ExpectThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> subject.noElement(null));
    }

    @Test
    void noElement_IsCalledWithEmptyCollection_ExpectReturnTrue() {
        assertTrue(subject.noElement(Collections.emptyList()));
    }

    @Test
    void noElement_IsCalledWithNonEmptyCollection_ExpectReturnFalse() {
        assertFalse(subject.noElement(Arrays.asList("element")));
    }

    @Test
    void oneElement_IsCalledWithNullCollection_ExpectReturnFalse() {
        assertFalse(subject.oneElement(null));
    }

    @Test
    void oneElement_IsCalledWithEmptyCollection_ExpectReturnFalse() {
        assertFalse(subject.oneElement(Collections.emptyList()));
    }

    @Test
    void oneElement_IsCalledWithCollectionWithTwoElements_ExpectReturnFalse() {
        assertFalse(subject.oneElement(Arrays.asList("", "a")));
    }

    @Test
    void oneElement_IsCalledWithNonEmptyCollection_ExpectReturnTrue() {
        assertTrue(subject.oneElement(Arrays.asList("")));
    }

    @Test
    void nul_IsCalledWithCollectionWithNullElement_ExpectReturnTrue() {
        assertTrue(subject.nul(Arrays.asList(null, "nonNullElement")));
    }

    @Test
    void nul_IsCalledWithCollectionWithNoNullElement_ExpectReturnFalse() {
        assertFalse(subject.nul(Arrays.asList("nonNullElement")));
    }

    @Test
    void duplicate_IsCalledWithCollectionWithDuplicateElement_ExpectReturnTrue() {
        assertTrue(subject.duplicate(Arrays.asList("a", "a", "b")));
    }

    @Test
    void duplicate_IsCalledWithCollectionWithNoDuplicateElement_ExpectReturnFalse() {
        assertFalse(subject.duplicate(Arrays.asList("a", "b", "c")));
    }
}
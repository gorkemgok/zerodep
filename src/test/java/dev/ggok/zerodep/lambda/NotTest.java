package dev.ggok.zerodep.lambda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NotTest {

    private final Not subject = new Not();

    @Test
    void decimal_IsCalledWithNullString_ExpectReturnTrue() {
        assertTrue(subject.decimal(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", ".", "a", ".0", "0..0", "0."})
    void decimal_IsCalledWithNotDecimalStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.decimal(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "0.0", "1.0", "120.023", "12"})
    void decimal_IsCalledWithDecimalStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.decimal(value));
    }

    @Test
    void numeric_IsCalledWithNullString_ExpectReturnTrue() {
        assertTrue(subject.numeric(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "12"})
    void numeric_IsCalledWithNumericStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.numeric(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", ".", "1.", ".0", "1.0", "12.0", "10a"})
    void numeric_IsCalledWithNonNumericStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.numeric(value));
    }

    @Test
    void alphanumeric_IsCalledWithNullString_ExpectReturnTrue() {
        assertTrue(subject.alphanumeric(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-", ".-a", "a%", ".0", "1.0", "1 2"})
    void alphanumeric_IsCalledWithNonAlphanumericStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.alphanumeric(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "a12", "A", "12", "1A2s"})
    void alphanumeric_IsCalledWithAlphanumericStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.alphanumeric(value));
    }

    @Test
    void blank_IsCalledWithNullString_ExpectReturnTrue() {
        assertTrue(subject.blank(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void blank_IsCalledWithBlankStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.blank(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "a", "1"})
    void blank_IsCalledWithNonBlankStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.blank(value));
    }

    @Test
    void empty_IsCalledWithNullString_ExpectReturnFalse() {
        assertFalse(subject.empty((String) null));
    }

    @Test
    void empty_IsCalledWithNullCollection_ExpectReturnFalse() {
        assertFalse(subject.empty((Collection) null));
    }

    @Test
    void empty_IsCalledWithCollectionWithNoElement_ExpectReturnFalse() {
        assertFalse(subject.empty(Collections.EMPTY_LIST));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void empty_IsCalledWithBlankStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.empty(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "a", "1"})
    void empty_IsCalledWithNonBlankStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.empty(value));
    }

    @Test
    void nul_IsCalledWithNullObject_ExpectReturnFalse() {
        assertFalse(subject.nul(null));
    }

    @Test
    void nul_IsCalledWithNonNullObject_ExpectReturnFalse() {
        assertTrue(subject.nul(new Object()));
    }

    @Test
    void zero_IsCalledWithZeroInteger_ExpectReturnFalse() {
        assertFalse(subject.zero(0));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 1, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void zero_IsCalledWithNonZeroIntegers_ExpectReturnTrue(int value) {
        assertTrue(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroLong_ExpectReturnFalse() {
        assertFalse(subject.zero(0L));
    }

    @ParameterizedTest
    @ValueSource(longs = {-1L, 1L, Long.MAX_VALUE, Long.MIN_VALUE})
    void zero_IsCalledWithNonZeroLongs_ExpectReturnTrue(long value) {
        assertTrue(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroDouble_ExpectReturnFalse() {
        assertFalse(subject.zero(0.0));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, 1.0, 0.001, Double.MAX_VALUE, Double.MIN_VALUE})
    void zero_IsCalledWithNonZeroDoubles_ExpectReturnTrue(double value) {
        assertTrue(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroFloat_ExpectReturnFalse() {
        assertFalse(subject.zero(0.0f));
    }

    @ParameterizedTest
    @ValueSource(floats = {-1.0f, 1.0f, 0.001f, Float.MAX_VALUE, Float.MIN_VALUE})
    void zero_IsCalledWithNonZeroFloats_ExpectReturnTrue(float value) {
        assertTrue(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroShort_ExpectReturnFalse() {
        assertFalse(subject.zero((short) 0.0));
    }

    @ParameterizedTest
    @ValueSource(shorts = {(short) -1.0, (short) 1.0f, Short.MAX_VALUE, Short.MIN_VALUE})
    void zero_IsCalledWithNonZeroShorts_ExpectReturnTrue(short value) {
        assertTrue(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroBigDecimal_ExpectReturnFalse() {
        assertFalse(subject.zero(BigDecimal.ZERO));
    }

    @Test
    void zero_IsCalledWithNonZeroBigDecimals_ExpectReturnTrue() {
        assertTrue(subject.zero(BigDecimal.ONE));
        assertTrue(subject.zero(new BigDecimal("0.1")));
    }

    @Test
    void one_IsCalledWithOneInteger_ExpectReturnFalse() {
        assertFalse(subject.one(1));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void one_IsCalledWithNonOneIntegers_ExpectReturnTrue(int value) {
        assertTrue(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneLong_ExpectReturnFalse() {
        assertFalse(subject.one(1L));
    }

    @ParameterizedTest
    @ValueSource(longs = {-1L, 0L, Long.MAX_VALUE, Long.MIN_VALUE})
    void one_IsCalledWithNonOneLongs_ExpectReturnTrue(long value) {
        assertTrue(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneDouble_ExpectReturnFalse() {
        assertFalse(subject.one(1.0));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, 0.0, 0.001, Double.MAX_VALUE, Double.MIN_VALUE})
    void one_IsCalledWithNonOneDoubles_ExpectReturnTrue(double value) {
        assertTrue(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneFloat_ExpectReturnFalse() {
        assertFalse(subject.one(1.0f));
    }

    @ParameterizedTest
    @ValueSource(floats = {-1.0f, 0.0f, 0.001f, Float.MAX_VALUE, Float.MIN_VALUE})
    void one_IsCalledWithNonOneFloats_ExpectReturnTrue(float value) {
        assertTrue(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneShort_ExpectReturnFalse() {
        assertFalse(subject.one((short) 1.0));
    }

    @ParameterizedTest
    @ValueSource(shorts = {(short) -1.0, (short) 0.0f, Short.MAX_VALUE, Short.MIN_VALUE})
    void one_IsCalledWithNonOneShorts_ExpectReturnTrue(short value) {
        assertTrue(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneBigDecimal_ExpectReturnFalse() {
        assertFalse(subject.one(BigDecimal.ONE));
    }

    @Test
    void one_IsCalledWithNonOneBigDecimals_ExpectReturnTrue() {
        assertTrue(subject.one(BigDecimal.ZERO));
        assertTrue(subject.one(new BigDecimal("0.1")));
    }
}
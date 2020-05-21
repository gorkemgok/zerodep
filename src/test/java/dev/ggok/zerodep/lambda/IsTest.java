package dev.ggok.zerodep.lambda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsTest {

    private final Is subject = new Is();

    @Test
    void decimal_IsCalledWithNullString_ExpectReturnFalse() {
        assertFalse(subject.decimal(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", ".", "a", ".0", "0..0", "0."})
    void decimal_IsCalledWithNotDecimalStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.decimal(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "0.0", "1.0", "120.023", "12"})
    void decimal_IsCalledWithDecimalStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.decimal(value));
    }

    @Test
    void numeric_IsCalledWithNullString_ExpectReturnFalse() {
        assertFalse(subject.numeric(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "12"})
    void numeric_IsCalledWithNumericStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.numeric(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", ".", "1.", ".0", "1.0", "12.0", "10a"})
    void numeric_IsCalledWithNonNumericStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.numeric(value));
    }

    @Test
    void alphanumeric_IsCalledWithNullString_ExpectReturnFalse() {
        assertFalse(subject.alphanumeric(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-", ".-a", "a%", ".0", "1.0", "1 2"})
    void alphanumeric_IsCalledWithNonAlphanumericStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.alphanumeric(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "a12", "A", "12", "1A2s"})
    void alphanumeric_IsCalledWithAlphanumericStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.alphanumeric(value));
    }

    @Test
    void blank_IsCalledWithNullString_ExpectReturnFalse() {
        assertFalse(subject.blank(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void blank_IsCalledWithBlankStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.blank(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "a", "1"})
    void blank_IsCalledWithNonBlankStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.blank(value));
    }

    @Test
    void empty_IsCalledWithNullString_ExpectReturnTrue() {
        assertTrue(subject.empty((String) null));
    }

    @Test
    void empty_IsCalledWithNullCollection_ExpectReturnTrue() {
        assertTrue(subject.empty((Collection) null));
    }

    @Test
    void empty_IsCalledWithCollectionWithNoElement_ExpectReturnTrue() {
        assertTrue(subject.empty(Collections.EMPTY_LIST));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void empty_IsCalledWithBlankStrings_ExpectReturnTrue(String value) {
        assertTrue(subject.empty(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "a", "1"})
    void empty_IsCalledWithNonBlankStrings_ExpectReturnFalse(String value) {
        assertFalse(subject.empty(value));
    }

    @Test
    void nul_IsCalledWithNullObject_ExpectReturnTrue() {
        assertTrue(subject.nul(null));
    }

    @Test
    void nul_IsCalledWithNonNullObject_ExpectReturnTrue() {
        assertFalse(subject.nul(new Object()));
    }

    @Test
    void zero_IsCalledWithZeroInteger_ExpectReturnTrue() {
        assertTrue(subject.zero(0));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 1, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void zero_IsCalledWithNonZeroIntegers_ExpectReturnFalse(int value) {
        assertFalse(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroLong_ExpectReturnTrue() {
        assertTrue(subject.zero(0L));
    }

    @ParameterizedTest
    @ValueSource(longs = {-1L, 1L, Long.MAX_VALUE, Long.MIN_VALUE})
    void zero_IsCalledWithNonZeroLongs_ExpectReturnFalse(long value) {
        assertFalse(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroDouble_ExpectReturnTrue() {
        assertTrue(subject.zero(0.0));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, 1.0, 0.001, Double.MAX_VALUE, Double.MIN_VALUE})
    void zero_IsCalledWithNonZeroDoubles_ExpectReturnFalse(double value) {
        assertFalse(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroFloat_ExpectReturnTrue() {
        assertTrue(subject.zero(0.0f));
    }

    @ParameterizedTest
    @ValueSource(floats = {-1.0f, 1.0f, 0.001f, Float.MAX_VALUE, Float.MIN_VALUE})
    void zero_IsCalledWithNonZeroFloats_ExpectReturnFalse(float value) {
        assertFalse(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroShort_ExpectReturnTrue() {
        assertTrue(subject.zero((short) 0.0));
    }

    @ParameterizedTest
    @ValueSource(shorts = {(short) -1.0, (short) 1.0f, Short.MAX_VALUE, Short.MIN_VALUE})
    void zero_IsCalledWithNonZeroShorts_ExpectReturnFalse(short value) {
        assertFalse(subject.zero(value));
    }

    @Test
    void zero_IsCalledWithZeroBigDecimal_ExpectReturnTrue() {
        assertTrue(subject.zero(BigDecimal.ZERO));
    }

    @Test
    void zero_IsCalledWithNonZeroBigDecimals_ExpectReturnFalse() {
        assertFalse(subject.zero(BigDecimal.ONE));
        assertFalse(subject.zero(new BigDecimal("0.1")));
    }

    @Test
    void one_IsCalledWithOneInteger_ExpectReturnTrue() {
        assertTrue(subject.one(1));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void one_IsCalledWithNonOneIntegers_ExpectReturnFalse(int value) {
        assertFalse(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneLong_ExpectReturnTrue() {
        assertTrue(subject.one(1L));
    }

    @ParameterizedTest
    @ValueSource(longs = {-1L, 0L, Long.MAX_VALUE, Long.MIN_VALUE})
    void one_IsCalledWithNonOneLongs_ExpectReturnFalse(long value) {
        assertFalse(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneDouble_ExpectReturnTrue() {
        assertTrue(subject.one(1.0));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, 0.0, 0.001, Double.MAX_VALUE, Double.MIN_VALUE})
    void one_IsCalledWithNonOneDoubles_ExpectReturnFalse(double value) {
        assertFalse(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneFloat_ExpectReturnTrue() {
        assertTrue(subject.one(1.0f));
    }

    @ParameterizedTest
    @ValueSource(floats = {-1.0f, 0.0f, 0.001f, Float.MAX_VALUE, Float.MIN_VALUE})
    void one_IsCalledWithNonOneFloats_ExpectReturnFalse(float value) {
        assertFalse(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneShort_ExpectReturnTrue() {
        assertTrue(subject.one((short) 1.0));
    }

    @ParameterizedTest
    @ValueSource(shorts = {(short) -1.0, (short) 0.0f, Short.MAX_VALUE, Short.MIN_VALUE})
    void one_IsCalledWithNonOneShorts_ExpectReturnFalse(short value) {
        assertFalse(subject.one(value));
    }

    @Test
    void one_IsCalledWithOneBigDecimal_ExpectReturnTrue() {
        assertTrue(subject.one(BigDecimal.ONE));
    }

    @Test
    void one_IsCalledWithNonOneBigDecimals_ExpectReturnFalse() {
        assertFalse(subject.one(BigDecimal.ZERO));
        assertFalse(subject.one(new BigDecimal("0.1")));
    }
}
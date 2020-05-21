package dev.ggok.zerodep;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static dev.ggok.zerodep.internal.Constants.PRIVATE_CONSTRUCTOR_MSG;
import static org.junit.jupiter.api.Assertions.*;

public class TestUtils {

    public static void assertUtilClass(Class<?> clazz) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        assertEquals(1, constructors.length);
        Constructor<?> constructor = constructors[0];
        constructor.setAccessible(true);
        InvocationTargetException invocationTargetException = assertThrows(InvocationTargetException.class, constructor::newInstance);
        Throwable targetException = invocationTargetException.getTargetException();
        assertTrue(targetException instanceof UnsupportedOperationException);
        UnsupportedOperationException unsupportedOperationException = (UnsupportedOperationException) targetException;
        assertEquals(PRIVATE_CONSTRUCTOR_MSG, unsupportedOperationException.getMessage());
    }
}

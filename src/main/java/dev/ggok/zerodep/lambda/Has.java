package dev.ggok.zerodep.lambda;

import java.util.Collection;

import static dev.ggok.zerodep.lambda.Ugly.not;

/**
 * This utility class provides human readable one parameter static methods to use as method reference.
 * All methods return {@code true} or {@code false} values which are answers to "has" questions.
 *
 * @author Gorkem Gok
 * @since 1.0
 */
public final class Has {

    Has() {
    }

    public <T> boolean anyElement(Collection<T> collection) {
        return not.nul(collection) && !collection.isEmpty();
    }

    public <T> boolean noElement(Collection<T> collection) {
        return !collection.isEmpty();
    }

    public <T> boolean oneElement(Collection<T> collection) {
        return not.nul(collection) && collection.size() == 1;
    }

    public <T> boolean nul(Collection<T> collection) {
        return not.nul(collection) && collection.contains(null);
    }

    public <T> boolean duplicate(Collection<T> collection) {
        if (not.nul(collection)) {
            Object[] arr = collection.toArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] != null && arr[i].equals(arr[j])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

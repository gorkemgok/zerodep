zerodep library provides various utilities make developer's life easier with ZERO 3rd party (production) dependency.

### `TimeUnitConstants` and `DataSizeConstants` 
These classes contain constant to convert time and data units.

```java
long millis = 2 * TimeUnitConstants.MINUTES_TO_MILLIS;
```  
is equivalent of
```java
long millis = TimeUnit.MINUTES.inMillis(2);
```
Why use these constants when we have `TimeUnit` class? 
We can't use `TimeUnit` class with the annotations because the values passed to annotations must be constant.
For example the following code is invalid. It will raise a compilation error.
```java
public interface MyService {
    @Retryable(backoff = @Backoff(delay = TimeUnit.MINUTES.inMillis(2)))
    void retryService(String sql) throws SQLException;
}
```
It should be:
```java
public interface MyService {
    @Retryable(backoff = @Backoff(delay = 120000))
    void retryService(String sql) throws SQLException;
}
```
Instead, you can use the following code:
```java
import static dev.ggok.zerodep.constant.TimeUnitConstants.MINUTES_TO_MILLIS;

public interface MyService {
    @Retryable(backoff = @Backoff(delay = 2 * MINUTES_TO_MILLIS))
    void retryService(String sql) throws SQLException;
}
```
It is more readable in this way.
 
The operator for conversion is always multiplication (*).
```java
2 * MINUTES_TO_MILLIS == 120000 // 2 minutes is 120000 seconds
```
```java
120000 * MILLIS_TO_MINUTES == 2 // 120000 millisecond is 2 minutes
```
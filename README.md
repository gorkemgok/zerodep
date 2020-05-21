[![Maven Central](https://img.shields.io/maven-central/v/dev.ggok.zerodep/zerodep.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22dev.ggok.zerodep%22%20AND%20a:%22zerodep%22)

# Zerodep Utility Library

Zerodep provides various utilities make developer's life easier with **ZERO** 3rd party (production) dependency.

The main goal of this library is to make the code **more readable**. 

## Install
Maven:
```xml
<dependency>
  <groupId>dev.ggok.zerodep</groupId>
  <artifactId>zerodep</artifactId>
  <version>1.0.1</version>
</dependency>
```
Gradle:
```groovy
implementation 'dev.ggok.zerodep:zerodep:1.0.1'
```
## Ugly class

Ugly class is a utility class that has 4 public fields which are `is`, `not`, `has` and `to`.
These are references to `Is`, `Not`, `Has` and `To` classes of which methods are meant to be used mostly as a method reference in lambda expressions.

Without Zerodep:
```java
collection.stream()
    .filter(Objects::nonNull)
    .map(Object::toString)
```

With Zerodep:
```java
Stream.of("")
    .filter(not::nul)
    .map(to::string)
```

The reason of name "Ugly" is to force developer to statically import the fields in the class.

Instead of:
```java
Stream.of(null).anyMatch(Ugly.is::empty);
``` 
Use:
```java
import static dev.ggok.zerodep.lambda.Ugly.*;
...
Stream.of(null).anyMatch(is::empty);
``` 

### Methods
|Is                 | Not               | Has                | To            |
|---                |---                |---                 |---            |
|`is::nul`          |`not::null`        |`has::nul`          |`to::string`   |
|`is::empty`        |`not::empty`       |`has::dublicate`    |`to::integer`  |
|`is::blank`        |`not::blank`       |`has::oneElement`   |`to::integer`  |
|`is::decimal`      |`not::decimal`     |`has::anyElement`   |`to::lng`      |
|`is::numeric`      |`not::numeric`     |`has::noElement`    |               |
|`is::alphanumeric` |`not::alphanumeric`|                    |               |
|`is::zero`         |`not::zero`        |                    |               |
|`is::one`          |`not::one`         |                    |               |

## TimeUnitConstants and DataSizeConstants classes 
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
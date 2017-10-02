# JDK9 Reactive Streams

A Java 8 version of reactive-streams that becomes compatible with the *Flow* interfaces when using it on Java 9.

It uses the [JEP 238 Multi-Release JAR feature](http://openjdk.java.net/jeps/238).

The [reactive-streams-compat](/reactive-streams-compat) module provides 4 interfaces:
- *me.nicolaferraro.reactivestreams.Publisher*
- *me.nicolaferraro.reactivestreams.Subscriber*
- *me.nicolaferraro.reactivestreams.Subscription*
- *me.nicolaferraro.reactivestreams.Processor*

Those interfaces behave differently depending on which version of java your running:
- Java 8: interfaces extend from *org.reactivestreams* equivalents;
- Java 9: interfaces extend from both *org.reactivestreams* and *java.util.concurrent.Flow* equivalents.

## Building

This project must be *built* with Java 9 and can be *used* with Java 8 or Java 9.

Run this command using a Java 9 JVM:
```
mvn clean install
``` 

## Testing

Tests in [reactive-streams-compat-jdk8-tests](/reactive-streams-compat-jdk8-tests) are configured to run only on a Java 8 JVM 
(and thus they should run separately from the main build that is using Java 9).

Tests in [reactive-streams-compat-jdk9-tests](/reactive-streams-compat-jdk9-tests) are configured to run only on a Java 9 JVM.

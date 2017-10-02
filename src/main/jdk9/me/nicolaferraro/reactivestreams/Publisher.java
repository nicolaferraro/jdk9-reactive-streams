package me.nicolaferraro.reactivestreams;

import java.util.concurrent.Flow;

public interface Publisher<T> extends org.reactivestreams.Publisher<T>, Flow.Publisher<T> {
}

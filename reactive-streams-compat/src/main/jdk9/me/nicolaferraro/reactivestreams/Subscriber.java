package me.nicolaferraro.reactivestreams;

import java.util.concurrent.Flow;

public interface Subscriber<T> extends org.reactivestreams.Subscriber<T>, Flow.Subscriber<T> {
}

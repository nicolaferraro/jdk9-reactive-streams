package me.nicolaferraro.reactivestreams;

import java.util.concurrent.Flow;

public interface Processor<T, R> extends org.reactivestreams.Processor<T, R>, Flow.Processor<T, R> {
}

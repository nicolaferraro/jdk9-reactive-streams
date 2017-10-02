package me.nicolaferraro.reactivestreams;

import java.util.concurrent.Flow;

public interface Publisher<T> extends org.reactivestreams.Publisher<T>, Flow.Publisher<T> {

    @Override
    default void subscribe(Flow.Subscriber<? super T> subscriber) {
        subscribe(ReactiveStreamsBridge.convert(subscriber));
    }

    @Override
    default void subscribe(org.reactivestreams.Subscriber<? super T> subscriber) {
        subscribe(ReactiveStreamsBridge.convert(subscriber));
    }

    void subscribe(Subscriber<? super T> subscriber);
}

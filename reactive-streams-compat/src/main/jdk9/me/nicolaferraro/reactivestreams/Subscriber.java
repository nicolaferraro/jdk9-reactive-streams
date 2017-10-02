package me.nicolaferraro.reactivestreams;


import java.util.concurrent.Flow;

public interface Subscriber<T> extends org.reactivestreams.Subscriber<T>, Flow.Subscriber<T> {

    @Override
    default void onSubscribe(Flow.Subscription subscription) {
        onSubscribe(ReactiveStreamsBridge.convert(subscription));
    }

    @Override
    default void onSubscribe(org.reactivestreams.Subscription subscription) {
        onSubscribe(ReactiveStreamsBridge.convert(subscription));
    }

    void onSubscribe(Subscription subscription);

}

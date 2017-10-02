package me.nicolaferraro.reactivestreams;

public interface Processor<T, R> extends org.reactivestreams.Processor<T, R> {

    @Override
    default void subscribe(org.reactivestreams.Subscriber<? super R> subscriber) {
        subscribe(ReactiveStreamsBridge.convert(subscriber));
    }

    @Override
    default void onSubscribe(org.reactivestreams.Subscription subscription) {
        onSubscribe(ReactiveStreamsBridge.convert(subscription));
    }

    void subscribe(Subscriber<? super R> subscriber);

    void onSubscribe(Subscription subscription);

}

package me.nicolaferraro.reactivestreams;

public interface Subscriber<T> extends org.reactivestreams.Subscriber<T> {

    @Override
    default void onSubscribe(org.reactivestreams.Subscription subscription) {
        onSubscribe(ReactiveStreamsBridge.convert(subscription));
    }

    void onSubscribe(Subscription subscription);

}

package me.nicolaferraro.reactivestreams;

public interface Publisher<T> extends org.reactivestreams.Publisher<T> {

    @Override
    default void subscribe(org.reactivestreams.Subscriber<? super T> subscriber) {
        subscribe(ReactiveStreamsBridge.convert(subscriber));
    }

    void subscribe(Subscriber<? super T> subscriber);
}

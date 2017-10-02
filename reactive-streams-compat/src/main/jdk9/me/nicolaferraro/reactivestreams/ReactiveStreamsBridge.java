package me.nicolaferraro.reactivestreams;

import java.util.concurrent.Flow;

class ReactiveStreamsBridge {

    private ReactiveStreamsBridge() {
        throw new IllegalStateException("No instances!");
    }

    /*
     * Conversion of org.reactivestreams objects
     */

    static <T> Subscriber<T> convert(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (subscriber == null) {
            return null;
        }

        return new Subscriber<T>() {
            public void onSubscribe(Subscription subscription) {
                subscriber.onSubscribe(subscription);
            }

            public void onNext(T item) {
                subscriber.onNext(item);
            }

            public void onError(Throwable throwable) {
                subscriber.onError(throwable);
            }

            public void onComplete() {
                subscriber.onComplete();
            }
        };
    }


    static Subscription convert(org.reactivestreams.Subscription subscription) {
        if (subscription == null) {
            return null;
        }

        return new me.nicolaferraro.reactivestreams.Subscription() {
            public void request(long n) {
                subscription.request(n);
            }

            public void cancel() {
                subscription.cancel();
            }
        };
    }

    /*
     * Conversion of java.util.concurrent.Flow objects
     */

    static <T> Subscriber<T> convert(Flow.Subscriber<? super T> subscriber) {
        if (subscriber == null) {
            return null;
        }

        return new Subscriber<>() {
            public void onSubscribe(Subscription subscription) {
                subscriber.onSubscribe(subscription);
            }

            public void onNext(T item) {
                subscriber.onNext(item);
            }

            public void onError(Throwable throwable) {
                subscriber.onError(throwable);
            }

            public void onComplete() {
                subscriber.onComplete();
            }
        };
    }

    static Subscription convert(Flow.Subscription subscription) {
        if (subscription == null) {
            return null;
        }

        return new me.nicolaferraro.reactivestreams.Subscription() {
            public void request(long n) {
                subscription.request(n);
            }

            public void cancel() {
                subscription.cancel();
            }
        };
    }

}

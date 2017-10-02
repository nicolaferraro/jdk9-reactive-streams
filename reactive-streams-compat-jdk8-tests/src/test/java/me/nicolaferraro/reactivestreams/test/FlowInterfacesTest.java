package me.nicolaferraro.reactivestreams.test;

import me.nicolaferraro.reactivestreams.Processor;
import me.nicolaferraro.reactivestreams.Publisher;
import me.nicolaferraro.reactivestreams.Subscriber;
import me.nicolaferraro.reactivestreams.Subscription;
import org.apache.commons.lang3.ClassUtils;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertFalse;

public class FlowInterfacesTest {

    @Test
    public void testFlowPublisher() {

        Publisher<String> publisher = new Publisher<String>() {
            @Override
            public void subscribe(Subscriber<? super String> subscriber) {

            }
        };

        Optional<Class<?>> impl = ClassUtils.getAllInterfaces(publisher.getClass())
                .stream()
                .filter(c -> c.getName().equals("java.util.concurrent.Flow$Publisher"))
                .findFirst();

        assertFalse(impl.isPresent());
    }

    @Test
    public void testFlowSubscriber() {

        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onSubscribe(Subscription subscription) {

            }

            @Override
            public void onNext(String s) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };

        Optional<Class<?>> impl = ClassUtils.getAllInterfaces(subscriber.getClass())
                .stream()
                .filter(c -> c.getName().equals("java.util.concurrent.Flow$Subscriber"))
                .findFirst();

        assertFalse(impl.isPresent());
    }

    @Test
    public void testFlowSubscription() {

        Subscription subscription = new Subscription() {
            @Override
            public void request(long l) {

            }

            @Override
            public void cancel() {

            }
        };

        Optional<Class<?>> impl = ClassUtils.getAllInterfaces(subscription.getClass())
                .stream()
                .filter(c -> c.getName().equals("java.util.concurrent.Flow$Subscription"))
                .findFirst();

        assertFalse(impl.isPresent());
    }

    @Test
    public void testFlowProcessor() {

        Processor<String, String> processor = new Processor<String, String>() {
            @Override
            public void subscribe(Subscriber<? super String> subscriber) {

            }

            @Override
            public void onSubscribe(Subscription subscription) {

            }

            @Override
            public void onNext(String s) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };

        Optional<Class<?>> impl = ClassUtils.getAllInterfaces(processor.getClass())
                .stream()
                .filter(c -> c.getName().equals("java.util.concurrent.Flow$Processor"))
                .findFirst();

        assertFalse(impl.isPresent());
    }

}

package org.acme.quickstart;

import io.quarkus.scheduler.Scheduled;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class CountService {

    private AtomicInteger counter = new AtomicInteger();

    public int get() {
        return counter.get();
    }

    @Scheduled(every="10s")
    void increment() {
        counter.incrementAndGet();
    }

    @Scheduled(cron = "20 * * ? * * *")
    void increment2() {
        counter.incrementAndGet();
    }
    
}
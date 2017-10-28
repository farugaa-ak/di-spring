package pl.akademiakodu.model.workers;

import org.springframework.stereotype.Component;

@Component
public class LazyWorker implements Worker{

    public void work() {
        System.out.println("Lazy worker - I'm working...");
    }

    public void doSleep(){
        System.out.println("I'm going sleep");
    }
}

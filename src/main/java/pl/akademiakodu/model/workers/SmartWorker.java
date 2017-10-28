package pl.akademiakodu.model.workers;

import org.springframework.stereotype.Component;

@Component
public class SmartWorker implements Worker {
    public void work() {
        System.out.println("SmartWorker is working");
    }
}

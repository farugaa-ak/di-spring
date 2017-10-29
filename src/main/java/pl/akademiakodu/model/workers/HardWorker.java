package pl.akademiakodu.model.workers;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.workers.Worker;

public class HardWorker implements Worker {

    public void work() {
        System.out.println("HardWorker is working...");
    }
}

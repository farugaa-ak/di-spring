package pl.akademiakodu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.akademiakodu.model.workers.Worker;

@Component
public class Company {

    Worker lazyWorker;
    Worker hardWorker;
    Worker smartWorker;

    Manager manager;
    //OPTIONAL @Autowired
    public Company(Worker lazyWorker, Worker hardWorker, Worker smartWorker,Manager manager) {
        this.lazyWorker = lazyWorker;
        this.hardWorker = hardWorker;
        this.smartWorker = smartWorker;
        this.manager = manager;
    }

    public void work() {
        lazyWorker.work();
        hardWorker.work();
        smartWorker.work();
        manager.say();
    }
}

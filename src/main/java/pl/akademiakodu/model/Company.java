package pl.akademiakodu.model;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.workers.Worker;

@Component
public class Company {

    Worker lazyWorker;
    Worker hardWorker;
    Worker smarWorker;

    public Company(Worker lazyWorker, Worker hardWorker, Worker smarWorker) {
        this.lazyWorker = lazyWorker;
        this.hardWorker = hardWorker;
        this.smarWorker = smarWorker;
    }

    public void work() {
        lazyWorker.work();
        hardWorker.work();
        smarWorker.work();
    }
}

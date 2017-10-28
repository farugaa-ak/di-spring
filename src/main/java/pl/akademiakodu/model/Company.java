package pl.akademiakodu.model;

import pl.akademiakodu.model.workers.Worker;

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

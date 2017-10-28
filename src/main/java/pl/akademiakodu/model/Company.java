package pl.akademiakodu.model;

public class Company {

    Worker lazyWorker;
    Worker hardWorker;

    public Company(Worker lazyWorker, Worker hardWorker) {
        this.lazyWorker = lazyWorker;
        this.hardWorker = hardWorker;
    }

    public void work() {
        lazyWorker.work();
        hardWorker.work();
    }
}

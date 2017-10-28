package pl.akademiakodu.model;

public class Company {

    Worker lazyWorker;
    HardWorker hardWorker;

    public Company() {
        lazyWorker = new LazyWorker();
        this.hardWorker = new HardWorker();
    }

    public void work() {
        lazyWorker.work();
        hardWorker.work();
    }
}

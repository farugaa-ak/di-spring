package pl.akademiakodu;

import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.OnePersonCompany;
import pl.akademiakodu.model.workers.HardWorker;
import pl.akademiakodu.model.workers.LazyWorker;
import pl.akademiakodu.model.workers.SmartWorker;
import pl.akademiakodu.model.workers.Worker;

public class DependencyInjectionContainer {

    public Worker hardWorker() {
        return new HardWorker();
    }

    public Worker smartWorker() {
        return new SmartWorker();
    }

    public Worker lazyWorker() {
        return new LazyWorker();
    }

    public OnePersonCompany onePersonCompany(Worker worker) {
        return new OnePersonCompany(worker);
    }

    public Company company(Worker smartWorker, Worker hardWorker, Worker lazyWorker) {
        return new Company(smartWorker, hardWorker, lazyWorker);
    }
}

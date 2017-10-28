package pl.akademiakodu;

import pl.akademiakodu.model.OnePersonCompany;
import pl.akademiakodu.model.workers.Worker;

public class AppOnePersonCompany {

    DependencyInjectionContainer dependencyInjectionContainer = new DependencyInjectionContainer();

    public static void main(String[] args) {
        AppOnePersonCompany appOnePersonCompany = new AppOnePersonCompany();
        appOnePersonCompany.start();
    }

    private void start() {
        Worker smartWorker = dependencyInjectionContainer.smartWorker();
        Worker hardWorker = dependencyInjectionContainer.hardWorker();
        Worker lazyWorker = dependencyInjectionContainer.lazyWorker();

        Worker worker = dependencyInjectionContainer.multiWorker(smartWorker,hardWorker, lazyWorker);
        OnePersonCompany onePersonCompany = dependencyInjectionContainer.onePersonCompany(worker);
        onePersonCompany.work();

    }
}

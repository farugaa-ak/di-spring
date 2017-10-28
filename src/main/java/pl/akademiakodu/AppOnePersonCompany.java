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
        Worker worker = dependencyInjectionContainer.hardWorker();
        OnePersonCompany onePersonCompany = dependencyInjectionContainer.onePersonCompany(worker);
        onePersonCompany.work();

    }
}

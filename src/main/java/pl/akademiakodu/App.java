package pl.akademiakodu;

import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.workers.Worker;

/**
 * Hello world!
 */
public class App {

    DependencyInjectionContainer dependencyInjectionContainer = new DependencyInjectionContainer();

    public static void main(String[] args) {
        App app = new App();
        app.start();

    }

    public void start() {
        Worker smartWorker = dependencyInjectionContainer.smartWorker();
        Worker hardWorker = dependencyInjectionContainer.hardWorker();
        Worker lazyWorker = dependencyInjectionContainer.lazyWorker();
        Company company = dependencyInjectionContainer.company(smartWorker, hardWorker, lazyWorker);

        company.work();


    }
}

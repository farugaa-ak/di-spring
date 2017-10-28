package pl.akademiakodu.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.akademiakodu.model.OnePersonCompany;
import pl.akademiakodu.model.workers.Worker;

@Service
public class AppOnePersonCompany {

    @Autowired
    Worker smartWorker;

    @Autowired
    Worker hardWorker;

    @Autowired
    Worker lazyWorker;

    DependencyInjectionContainer dependencyInjectionContainer = new DependencyInjectionContainer();

    public void start() {
        Worker smartWorker = dependencyInjectionContainer.smartWorker();
        Worker hardWorker = dependencyInjectionContainer.hardWorker();
        Worker lazyWorker = dependencyInjectionContainer.lazyWorker();

        Worker worker = dependencyInjectionContainer.multiWorker(smartWorker,hardWorker, lazyWorker);
        OnePersonCompany onePersonCompany = dependencyInjectionContainer.onePersonCompany(worker);
        onePersonCompany.work();

    }
}

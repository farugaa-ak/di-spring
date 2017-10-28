package pl.akademiakodu;

import pl.akademiakodu.model.OnePersonCompany;
import pl.akademiakodu.model.workers.LazyWorker;
import pl.akademiakodu.model.workers.Worker;

public class DependencyInjectionContainer {

    public Worker worker(){
        return new LazyWorker();
    }

    public OnePersonCompany onePersonCompany(Worker worker){
        return new OnePersonCompany(worker);
    }
}

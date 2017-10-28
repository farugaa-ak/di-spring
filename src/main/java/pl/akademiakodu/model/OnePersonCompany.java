package pl.akademiakodu.model;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.workers.Worker;

@Component
public class OnePersonCompany {

    private Worker worker;

    public OnePersonCompany(Worker worker) {
        this.worker = worker;
    }

    public void work(){
        worker.work();
    }
}

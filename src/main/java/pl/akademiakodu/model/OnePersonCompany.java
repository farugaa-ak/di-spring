package pl.akademiakodu.model;

import pl.akademiakodu.model.workers.Worker;

public class OnePersonCompany {

    private Worker worker;

    public OnePersonCompany(Worker worker) {
        this.worker = worker;
    }

    public void work(){
        worker.work();
    }
}

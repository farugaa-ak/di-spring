package pl.akademiakodu.model;

import pl.akademiakodu.model.workers.Worker;

public class OnePersonCompany {

    private Worker multiWorker;

    public OnePersonCompany(Worker multiWorker) {
        this.multiWorker = multiWorker;
    }

    public void work(){
        multiWorker.work();
    }
}

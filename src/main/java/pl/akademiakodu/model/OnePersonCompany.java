package pl.akademiakodu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.akademiakodu.model.workers.Worker;

@Component
public class OnePersonCompany {

    @Autowired
    private Worker lazyWorker;

    public void work(){
        lazyWorker.work();
    }
}

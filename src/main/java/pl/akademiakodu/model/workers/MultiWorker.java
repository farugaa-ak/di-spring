package pl.akademiakodu.model.workers;

import java.util.ArrayList;
import java.util.List;

/*
    Decorator + Composite pattern
 */
public class MultiWorker implements Worker {

    private List<Worker> workers;

    public MultiWorker(Worker... workers) {
        this.workers = new ArrayList<Worker>();
        for (Worker worker : workers) {
            this.workers.add(worker);
        }
    }

    public void work() {
        for (Worker worker : workers) {
            worker.work();
        }

    }
}

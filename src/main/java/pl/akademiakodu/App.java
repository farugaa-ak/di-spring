package pl.akademiakodu;

import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.OnePersonCompany;
import pl.akademiakodu.model.workers.HardWorker;
import pl.akademiakodu.model.workers.LazyWorker;
import pl.akademiakodu.model.workers.SmartWorker;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main(String[] args )
    {
        LazyWorker lazyWorker = new LazyWorker();
        HardWorker hardWorker = new HardWorker();
        SmartWorker smartWorker = new SmartWorker();

        Company company = new Company(lazyWorker, hardWorker, smartWorker);


        company.work();











    }
}

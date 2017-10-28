package pl.akademiakodu;

import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.HardWorker;
import pl.akademiakodu.model.LazyWorker;

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
        Company company = new Company(lazyWorker, hardWorker);


        company.work();
    }
}

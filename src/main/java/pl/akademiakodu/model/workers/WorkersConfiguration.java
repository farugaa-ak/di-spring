package pl.akademiakodu.model.workers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkersConfiguration {

    @Bean
    Worker hardWorker(){
        return new HardWorker();
    }

    @Bean
    Worker lazyWorker(){
        return new LazyWorker();
    }

    @Bean
    Worker smartWorker(){
        return new SmartWorker();
    }

    @Bean
    Worker multiWorker(){
        return new MultiWorker(smartWorker(), lazyWorker(), hardWorker());
    }
}

package wooteco.helloworld;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class SpringCoreService {
    public String sayName(String name) throws InterruptedException {
        doHeavyWork();
        return "My name is " + name;
    }

    private void doHeavyWork() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
    }
}

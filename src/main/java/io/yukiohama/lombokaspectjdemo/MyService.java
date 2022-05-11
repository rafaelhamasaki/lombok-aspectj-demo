package io.yukiohama.lombokaspectjdemo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyService {

    private MyRepository myRepository;

    MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Transactional
    public MyEntity save() {
        MyEntity myEntity = new MyEntity();
        myRepository.save(myEntity);
        return myEntity;
    }
}

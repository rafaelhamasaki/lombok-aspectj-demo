package io.yukiohama.lombokaspectjdemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    MyController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping
    public MyEntity post() {
        return myService.save();
    }
}

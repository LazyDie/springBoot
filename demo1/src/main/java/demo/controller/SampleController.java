package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by TIAN on 2018/5/28.
 */

@RestController
public class SampleController {

    @RequestMapping(value = "/")
    public String home() {
        return "Hello World";
    }

}

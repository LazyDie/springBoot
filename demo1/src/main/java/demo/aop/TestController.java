package demo.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by TIAN on 2018/5/28.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/hello")
    public String show(){
        return "test";
    }
}

package demo.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by TIAN on 2018/5/28.
 */

@RestController
public class SampleController {
    Logger logger = LoggerFactory.getLogger(SampleController.class);
    @RequestMapping(value = "/")
    public String home() {
        logger.debug("方法执行中。。。。。。。。。。。。");
        return "Hello World";
    }

}

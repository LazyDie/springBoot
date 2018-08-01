package demo.aop;

import org.apache.juli.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by TIAN on 2018/5/28.
 */

@Component
@Aspect
public class AopConfig {

    Logger logger = LoggerFactory.getLogger(AopConfig.class);

    private final String name = "金天锋";

    @Pointcut(value = "execution(public * demo.controller..*.*(..))")
    public void pointCut(){}

    @Around("pointCut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
        Object ob = null;
        System.out.println(joinPoint.getSignature().getDeclaringType());
        System.out.println("--------------");
        joinPoint.proceed();
        System.out.println("--------------");
        return ob;
    }
    @Before("pointCut()")
    public void beforeMethod(){
        System.out.println("方法之前");
        logger.info("info {} ",name);
        logger.debug("debug");

        ///特他说他是天堂
    }

    @After("pointCut()")
    public void afterMethod(){
        System.out.println("方法之后");
    }
}

package demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by TIAN on 2018/5/28.
 */

@Component
@Aspect
public class AopConfig {
    @Pointcut(value = "execution(public * demo.controller..*.*(..))")
    public void pointCut(){}

    /*@Around("pointCut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
        Object ob = null;
        System.out.println(joinPoint.getSignature().getDeclaringType());
        System.out.println("--------------");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println(signature);
        Method method = signature.getMethod();
        System.out.println(method);
        joinPoint.proceed();
        System.out.println("--------------");
        return ob;
    }*/
    @Before("pointCut()")
    public void beforeMethod(){
        System.out.println("方法之前");
    }

    @After("pointCut()")
    public void afterMethod(){
        System.out.println("方法之后");
    }
}

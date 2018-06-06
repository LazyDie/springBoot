package demo.porxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by TIAN on 2018/6/6.
 */
public class ArithmeticCalculatorLoggingProxy {

    /**
     * 需要代理的对象
     */
    private AtithmeticCalculator target;

    public ArithmeticCalculatorLoggingProxy(AtithmeticCalculator target) {
        this.target = target;
    }

    public AtithmeticCalculator getLoggerPorxy(){
        //指定代理对象由哪个类加载器进行加载
        ClassLoader loader = target.getClass().getClassLoader();
        //代理对象的类型
        Class[] interfaces = new Class[]{AtithmeticCalculator.class};
        //代理对象需要执行的逻辑，当调用代理对象其中的方法时，执行该代码
        InvocationHandler h = new InvocationHandler() {
            /**
             * 记录日志的方法
             * @param proxy 正在返回的那个代理对象，一般情况下，在invoke中不使用该对象
             * @param method 正在被调用的方法
             * @param args 调用方法时，传入的参数
             * @return 一般返回代理对象返回的结果
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //被调用对象的方法名
                String methodName = method.getName();
                //记录开始日志
                System.out.println("调用"+methodName+"方法，处理"+ Arrays.asList(args));
                //执行原对象的方法
                Object invoke = method.invoke(target, args);
                //记录结束日志
                System.out.println("处理结果为："+invoke);
                return invoke;
            }
        };
        return (AtithmeticCalculator) Proxy.newProxyInstance(loader,interfaces,h);
    }
}

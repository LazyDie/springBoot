package demo.porxy;

/**
 * Created by TIAN on 2018/6/6.
 */
public class ProxyTest {
    public static void main(String[] args) {
        AtithmeticCalculator target = new AtithmeticCalculatorImpl();
        AtithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggerPorxy();
        proxy.add(1, 2);
        proxy.mul(3, 5);
    }
}

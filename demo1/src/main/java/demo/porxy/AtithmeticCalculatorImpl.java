package demo.porxy;

/**
 * Created by TIAN on 2018/6/6.
 */
public class AtithmeticCalculatorImpl implements AtithmeticCalculator {

    @Override
    public int add(int i, int j) {
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        return i-j;
    }

    @Override
    public int mul(int i, int j) {
        return i*j;
    }

    @Override
    public int div(int i, int j) {
        return i/j;
    }
}

package test;

/**
 * Created by TIAN on 2018/6/11.
 */
public class StaticTest {
    public static void main(String[] args) {
        S.show();
        //F f = new S();
    }
}

class F{
    static int c;
    static int b;
    {
        System.out.println("F方法块");
    }
    static {
        System.out.println("F静态代码块"+c);
    }
    public F(){
        System.out.println("构造方法");
    }
}

class S extends  F{
    static int a;
    static int b;
    {
        System.out.println("S方法块");
    }
    static {
        System.out.println("S静态方法块"+a);
    }
    public S(){
        System.out.println("S构造方法");
    }

    public static void show() {
        System.out.println("S的静态方法");
    }
}
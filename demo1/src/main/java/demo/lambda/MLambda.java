package demo.lambda;

/**
 * Created by TIAN on 2018/6/6.
 */
public class MLambda {
    public static void main(String[] args) {
        ILambda iLambda = (a,b) -> {
          StringBuilder sb = new StringBuilder();
          sb.append(a);
          sb.append(b);
          return sb.toString();
        };
        String result = iLambda.getString(100, "hello");
        System.out.println(result);
    }
}

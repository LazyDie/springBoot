package test;

/**
 * Created by TIAN on 2018/6/15.
 */
public class MuYang {

    public static void main(String[] args) {
        for(int i =1 ; i< 10 ;i++)
            System.out.println(getMuYang(i)) ;
    }

    public static int getMuYang(int n) {
        switch (n){
            case 1 :
            case 2: return 1;
            case 3:
            case 4:return 2;
            case 5:
            case 6: return 3;
        }

        if(n != 1) {
            if (n % 2 != 0){
                return getMuYang(n-2) + getMuYang(n - 3);
            }
            else
                return getMuYang(n-1);
        }
        return 1;
    }
}

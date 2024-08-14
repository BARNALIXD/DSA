package methods;

public class factorial {
    public static void fac(int n){
          int f = 1;

          for(int i=0 ; i<n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fac(4));
    }
}

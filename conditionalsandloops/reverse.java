package conditionalsandloops;

public class reverse {
    public static void main(String[] args){
        int num = 2356748;

        int ans = 0 ;

        while (num>=0) {
            int rem = num  % 10 ;
            num /= 10;
            
            ans = ans*10 + rem;
            
        }
    System.out.println(ans);
    }
    
}

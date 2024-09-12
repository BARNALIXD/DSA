
class Solution{
    public:
    //You need to complete this fucntion
    
   long long myPow(int x,int n) {
    //   if(n==0 || x==1)
    //   return 1;
    //   else if(n<0){
    //       x=1/x;
    //       n=-n;
    //   } 
       long long xr=x;
       long long result=1;
       while(n){
        if(n%2){
        result=(result*xr)%1000000007;
        } 
        xr=(xr*xr)%1000000007;
        n/=2; 
       }
       return result;
    }
    long long power(int N,int R)
    {
     long long temp=myPow(N,R);
     return temp%1000000007;
    }

};
//
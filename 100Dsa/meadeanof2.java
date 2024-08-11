class meadeanof2 {
    public int sumOfMiddleElements(int[] arr1,int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int p[]=new int[n+m];
        for(int i=0;i<n;i++){
            //p[i]=arr1.get(i);
            p[i]=arr1[i];
        }
        for(int j=0;j<m;j++){
            //p[n+j]=arr2.get(j);
            p[n+j]=arr2[j];
        }
        Arrays.sort(p);
        int sum=0;
        int len=p.length;
        if (len % 2 == 0) {
            sum = p[len/2 - 1] + p[len/2];
        } else {
            sum = p[len/2];
        }
        return sum;
        //return 0; // This case will never occur for valid input
    }
}
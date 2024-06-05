class Solution {
    public double myPow(double x, int n) {
        // long N = n;
        // double temp = 1;
        // long dup = n;
        // double temp2 = rec(x,N,temp, dup);
        // // if (n > 0){
        // //     for (int i = 1; i <= n; i++){
        // //         temp = temp * x;
        // //     }

        // //     return temp;
        // // }

        // // for (int i = n; i < 0; i++){
        // //     temp = temp * (1/x);
        // // }

        // // return temp;
        // return temp2;

        //Striver's Optimal
        long ndup = n;
        double ans = 1.0;
        
        if (n<0){
            ndup = -1 * ndup;
        }

        while(ndup>0){

            if(ndup%2==1){
                ans = ans * x;
                ndup--;
            }

            else{
                x = x * x;
                ndup = ndup/2;
            }

        }

        if (n<0){
            ans = (double) 1 / (double) ans;
        }

        return ans;


    }

    // public static double rec(double x, long n, double temp, long dup){
        
    //     if (n>0){
    //         if (dup>=0){

    //             if (dup == 0){
                    
    //                 return temp;
    //             }

    //             return rec (x, n, temp * x, dup-1);
    //         }
    //     }

    //     if (dup==0){
    //         return temp;
    //     }

    //     return rec(x, n, temp * (1/x), dup+1);
    // }
}
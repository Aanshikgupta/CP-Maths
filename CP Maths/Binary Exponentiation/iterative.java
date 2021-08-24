import java.util.*;
public class iterative {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int n=kb.nextInt();


        System.out.println(iterativePower(a,n));
    }



    //Concept of this is take the binary of power(i.e n) and traverse from right if bit is 1 then multiply ans*=power(a,position) else ans=ans;
    private static int iterativePower(int a,int n) {
        int ans=1;
        if(n==0)
        return ans;

        while(n>0){
            if(n%2==1){
                ans*=a;
            }
            n=n>>1;
            a=a*a;
        }

        return ans;

        
    }
}

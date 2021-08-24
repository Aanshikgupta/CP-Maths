import java.util.*;
public class recursive {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int n=kb.nextInt();

        System.out.println(recursivePower(a,n));
    }



    //Concept of this is take the binary of power(i.e n) and traverse from right if bit is 1 then multiply ans*=power(a,position) else ans=ans;
    private static int recursivePower(int a,int n) {
       
        if(n==0)
        return 1;

        if(n%2==0){
            return recursivePower(a*a, n/2);
        }
        return recursivePower(a*a, n/2)*a;

        
    }
}

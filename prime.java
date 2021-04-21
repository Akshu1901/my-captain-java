import java.util.*;

class Test{
    static int i=2;
    public static boolean isprime(int n){
        if(n==0 || n==1){
            return false;
        }
        if(n==i){
            return true;
        }
        if(n%i==0){
            return false;
        }
        i++;
        return isprime(n);
    }
    public static void main(String []args){
        System.out.println("Please insert any number");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        if(isprime(p)){
            System.out.println(p+" is a prime number");
        }
        else{
             System.out.println(p+"is not a prime number");
        }
    }
}

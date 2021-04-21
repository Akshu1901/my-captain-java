import java.util.*;

class Test{
    static int n1=0,n2=1,n3=0;
    static public void fibo(int n){
        if(n>0){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(" "+n3);
         fibo(n-1);
        }
        
    }
    static public void main(String []args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        
        System.out.print(n1+" "+n2);
        fibo(f);
    }
}

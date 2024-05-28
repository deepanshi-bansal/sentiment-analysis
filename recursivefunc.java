import java.util.*;
public class recursivefunc{
    static int count=0;
    Scanner sc=new Scanner(System.in);
    public static int factorial(int n){
        count++;
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        int number=factorial(7);
        System.out.println("Factorial of a number is : "+number);
        System.out.println(count);
    }
}
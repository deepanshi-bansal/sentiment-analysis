import java.util.*;
public class printlargestof3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("First number is : ");
        int a=sc.nextInt();
        System.out.println("Second number is : ");
        int b=sc.nextInt();
        System.out.println("Third number is : ");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is largest");
        }
        else if(b>=c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}

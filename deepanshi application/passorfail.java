import java.util.*;
public class passorfail {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Your marks is : ");
        int marks=sc.nextInt();
        String result=(marks>=33)?"PASS":"FAIL";
        System.out.println("Your result is : "+result);
        sc.close();
    }
}

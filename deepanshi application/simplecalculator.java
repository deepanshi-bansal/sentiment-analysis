import java.util.*;
public class simplecalculator {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        System.out.println("Enter operator : ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println("Addition is : "+(a+b));
            break;
            case '-':
            System.out.println("Subtraction is : "+(a-b));
            break;
            case '*':
            System.out.println("Multiplication is : "+(a*b));
            break;
            case '/':
            System.out.println("Division is : "+(a/b));
            break;
            case '%':
            System.out.println("Modulus is : "+(a%b));
            break;
            default:
            System.out.println("Wrong operator");
          }
    sc.close();
}
}
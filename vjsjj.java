import java.util.*;
public class vjsjj{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
float a=10;
float b=20;
System.out.println("Enter operator : ");
char operator=sc.next().charAt(0);
switch(operator){
    case '+':System.out.println(a+b);
    break;
case '-':
System.out.println(a-b);
break;
case '*' :
System.out.println(a*b);
break;
case '/':
System.out.println(a/b);
break;
case '%':
System.out.println(a%b);
break;
default:
System.out.println("no operator");
}
sc.close();
    }
}
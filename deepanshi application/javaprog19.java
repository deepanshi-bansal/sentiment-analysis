//display all numbers entered by user except multiples of 10.
import java.util.*;
public class javaprog19 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter the number : ");
        int number=sc.nextInt();
        if(number%10==0)
        {
            continue;
        }
        System.out.println(number);
    }while(true);
    }
}

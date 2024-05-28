//keep entering number till user enters a multiple of 10 by using break
import java.util.*;
public class javaprog2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your number : ");
            int number=sc.nextInt();
            if(number%10==0)
            {
                break;
            }
            System.out.println(number);
            sc.close();
        }while(true);
    }
}

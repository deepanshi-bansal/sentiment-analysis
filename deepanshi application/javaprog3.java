//keep entering numbers till user enters a multiple of 10 by using continue
import java.util.*;
public class javaprog3 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("Enter your number : ");
            int number=sc.nextInt();
            if(number%10==0){
                continue;
            }
            System.out.println(number);
            sc.close();
    }while(true);
}
}

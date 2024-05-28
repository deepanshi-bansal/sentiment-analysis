import java.util.*;
public class javaprog12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is : "+sum);
    }
}

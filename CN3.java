
public class CN3{
    public static void main(String args[]){
        int num=3;
        if(num<=1){
            System.out.println("Neither composite nor prime");
            return;
        }
        int c=2;
        while(c<=Math.sqrt(num)){
            if(num%c==0){
                System.out.println("Not Prime");
                return;
            }
        c++;
        }
        System.out.println("Prime");
        }
        
    }
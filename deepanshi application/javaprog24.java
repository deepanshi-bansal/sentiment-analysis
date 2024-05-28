//Test for primes
public class javaprog24 {
    public static void main(String args[]){
        int num;
        boolean isprime;
        num=11;
        if(num<2) isprime=false;
        else isprime=true;
        for(int i=2;i<=num/i;i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}

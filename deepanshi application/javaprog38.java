public class javaprog38 {
    public static boolean isprime(int n){
        boolean isprime=true;
        if(n==2){
            isprime=true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
            return isprime;
    }
    public static void main(String args[]){
        System.out.println(isprime(2));
    }
}

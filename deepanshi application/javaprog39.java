public class javaprog39 {
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
    public static void primesinrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){//true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primesinrange(10);
    }
}

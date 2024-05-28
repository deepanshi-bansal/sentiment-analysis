public class javaprog32 {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        System.out.println("Factorial of a number is : "+factorial(4));
    }
}

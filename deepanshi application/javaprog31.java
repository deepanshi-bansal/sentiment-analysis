public class javaprog31 {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[]){
        int a=10;
        int b=5;
        swap(a,b);
        System.out.println("Swapped value of a is: "+a);
        System.out.println("Swapped value of b is: "+b);
    }
}

public class javaprog35 {
   public static int sum(int a,int b){
    return a+b;
   }
   public static float sum(float a,float b,float c){
    return a+b+c;
   }
   public static void main(String args[]){
    System.out.println("Sum of two integer numbers is : "+sum(4,5));
    System.out.println("Sum of three floating numbers is : "+sum(5.5f,1.5f,2.0f));
   } 
}

import java.util.*;
public class areaofacircle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println("Area of a circle is : "+area);
        sc.close();
    }
}

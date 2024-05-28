/*public class javabasics {
    public static void main(String args[]){
        int num1=3;
        int  num2=9;
        int num3=4;
        int sum=num1+num2+num3;
        System.out.println(sum);
    

//literal- the value which can be assigned to a variable
String str="Deepanshi";
System.out.println(str);
    }
} */
/*import java.util.*;
public class javabasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of sub1 : ");
        int sub1=sc.nextInt();
        System.out.println("Enter marks of sub2 : ");
        int sub2=sc.nextInt();
        System.out.println("Enter marks of sub3 : ");
        int sub3=sc.nextInt();
        System.out.println("Enter marks of sub4 : ");
        int sub4=sc.nextInt();
        System.out.println("Enter marks of sub5 : ");
        int sub5=sc.nextInt();
        float percentage=(sub1+sub2+sub3+sub4+sub5)/5f;
        System.out.println("Percentage of a student is : "+percentage);
    }
}*/ 
/*import java.util.*;
public class javabasics{
    public static void main(String args[]){
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        //bitwise operators
        System.out.println(2&3); //10 & 11-->10(2)
        //operator precedence and associativity
        int a=6*5-34/2; // left to right (30-17=13)
        System.out.println(a);
        int b=60/5-34*2; // left to right(12-68=-56)
        System.out.println(b);
    }
}*/
//increment and decrement operators
/*public class javabasics{
    public static void main(String args[]){
int i=56;
System.out.println(i++); //56
System.out.println(i); //57
System.out.println(++i); //58
System.out.println(i); //58
int k=67;
int b=k++;
System.out.println(b); //67
int j=90;
int c=++j;
System.out.println(c); //91
int y=7;
int x=++y*8;
System.out.println(x); // 64 (increment>multiplication)
char ch='a';
System.out.println(++ch); //b
float a=7/4*9/2;
System.out.println(a); // 4.0(because all are integers)
float t=7/4.0f*9/2.0f;
System.out.println(t); //7.875
    }
}*/
/*import java.util.*;
public class javabasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char grade='B';
        //Encrypt
        grade=(char)(grade+8);
        System.out.println(grade);
        //Decrypt
        grade=(char)(grade-8);
        System.out.println(grade);
        int b=1;
        int c=4;
        int a=5;
        int k=(b*b-4*a*c)/(2*a); //-7
        System.out.println(k);
        /*int z=sc.nextInt();
        System.out.println(z>8);*/
        /*int v=6;
        int u=3;
        int s=3;
        int g=2;
        float d=(v*v-u*u)/(2*g*s); // 2.0
        System.out.println(d);
        int y=7*49/7+35/7;
        System.out.println(y); // 54
        }
}*/
//question 1
/*class Circle{
    int r;
    Circle(int r){
        this.r=r;
    }
    double circumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*Math.pow(r,2);
    }

}
class Box{
    int b,h,l;
    Box(int b,int l,int h){
        this.b=b;
        this.l=l;
        this.h=h;
    }
    double areaofBox(){
        return 2*(l*h+b*l+l*b);
    }
    double volumeofbox(){
        return l*b*h;
    }
}
public class javabasics{
    public static void main(String args[]){
        Circle c1=new Circle(5);
        Box b1=new Box(3,4,5);
        System.out.println(c1.circumference());
        System.out.println(c1.area());
        System.out.println(b1.areaofBox());
        System.out.println(b1.volumeofbox());

    }
}*/
//question 2
/*import java.util.*;
class Petroliumtanks{
    int r;
    int h;
    Petroliumtanks(int r,int h){
    this.r=r;
    this.h=h;
}
double getsurfacearea(){
    return 2*3.14*r*(r+h);
}
double totalcost(double totalarea,double costpersquareunit,int nooftanks){
    return totalarea*nooftanks*costpersquareunit;
}
}
public class javabasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("radius : ");
        int r=sc.nextInt();
        System.out.println("height : ");
        int h=sc.nextInt();
        Petroliumtanks p1=new Petroliumtanks(r,h);
        System.out.println("No. of tanks : ");
        int nooftanks=sc.nextInt();
        System.out.println("Cost per square unit is : ");
        int costpersquareunit=sc.nextInt();
        double totalarea=p1.getsurfacearea();
        double totalcost=p1.totalcost(totalarea,costpersquareunit,nooftanks);
        System.out.println("Total cost is : "+totalcost);
        sc.close();

    }
}*/
//question 3
//constructor overloading
class Room{
    Room(int l,int b){
        int area=l*b;
        System.out.println("Area of a rectangle is : "+area);
    }
    Room(int l){
        int areaofsquare=l*l;
        System.out.println("Area of a square is : "+areaofsquare);
    }
}
public class javabasics{
    public static void main(String args[]){
    Room r1=new Room(6,7);
    Room r2=new Room(8);
    }
}

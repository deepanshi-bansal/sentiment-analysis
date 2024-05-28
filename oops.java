/*public class oops {
    public static void main(String args[]){
        Pen p1=new Pen(); //created a pen object called p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.color="orange";
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcpercentage(int phy,int maths,int chem){
        percentage=(phy+maths+chem)/3;
    }

} */

//access modifiers or specifiers
/*public class oops{
    public static void main(String args[]){
        Bankaccount acc1=new Bankaccount();
        acc1.username="Deepanshi_Bansal";
        System.out.println(acc1.username);
        acc1.setpassword("abcdefg");
    }
}
class Bankaccount{
   public String username;
   private String password;
   public void setpassword(String newpass){
    password=newpass;
   }
} */

//constructors
/*public class oops{
    public static void main(String args[]){
        Student s1=new Student("Deepanshi");
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int age;
    Student(String name){ //parameterized constructor
      this.name=name;  
    }
} */

/*(public class oops{
    public static void main(String args[]){
        Student s1=new Student();
    }
}
class Student{
    String name;
    int age;
    Student(){ // non-parameterized constructor
        System.out.println("Constructor has been called..");
    }
} */

//constructor overloading - according to the requirements of the object suitable constructor has been called
/*public class oops{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("deepanshi");
        Student s3=new Student(29);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructor is called..");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
} */

//inheritance example
/*public class oops{
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();
    }
}
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
//Derived class/subclass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
} */

//single level inheritance
/*public class oops{
    public static void main(String args[]){
        Human h1=new Human();
        h1.breathe();
        h1.lipsyncing();
    }
}
class Animal{
    String skincolor;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Human extends Animal{
    int legs;
    void lipsyncing(){
        System.out.println("can speak");
    } 
} */

//Multi level inheritance
/*public class oops{
    public static void main(String args[]){
        Dog d1=new Dog();
        d1.breathe();
        d1.legs=4;
        System.out.println(d1.legs);
        d1.breed="German Shepherd";
        System.out.println(d1.breed);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String breed;
} */

//hierarchical inheritance
/*public class oops{
    public static void main(String args[]){
        Mammals m1=new Mammals();
        Fish f1=new Fish();
        m1.breathe();
        f1.fins=2;
        System.out.println(f1.fins);   
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Humans can walk");
    }
} */

//hybrid inheritance
/*public class oops{
    public static void main(String args[]){
        Fish f1=new Fish();
        Mammal m1=new Mammal();
        Tuna t1=new Tuna();
        Shark s1=new Shark();
        Dog d1=new Dog();
        Human h1=new Human();
        f1.breathe();
        m1.eat();
        t1.eat();
        h1.color="skincolor";
        System.out.println(h1.color);
        d1.species();
        s1.attack();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Fish can swim");
    }
}
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Mammals can walk");
    }
}
class Tuna extends Fish{
    String breed;
}
class Shark extends Fish{
    void attack(){
        System.out.println("Sharks attack");
    }
}
class Dog extends Mammal{
    void species(){
        System.out.println("dogs have different species");
    }
} 
class Human extends Mammal{
    void talk(){
        System.out.println("Humans can talk");
    }
} */

//Function overloading or method overloading
//function overloading is compile time polymorphism
/*public class oops{
    public static void main(String args[]){
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,2,3));
        System.out.println(calc.sum(1.5f,6.5f));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
} */

//Function overriding or method overriding
//function overriding is run time polymorphism
/*public class oops{
    public static void main(String args[]){
        Deer d1=new Deer();
        d1.eat(); //in method overrriiding it will call the function associated to its class
    }
}
class Animal{
    void eat(){ //parent and child class both have the same function but with a different definition
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}*/

//abstract class
/*public class oops{
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color); //brown
        h1.changecolor();
        System.out.println(h1.color); //darkbrown
        Chicken c1=new Chicken();
        c1.eat();
        c1.walk();
        System.out.println(c1.color); //brown
        c1.changecolor();
        System.out.println(c1.color); //yellow
        //Animal a1=new Animal(); --> cannot create object of abstract class Animal
        Mustang m=new Mustang();
        //Animal <--Horse<--Mustang
    }
}
abstract class Animal{ //Parent class
    String color;
    Animal(){
       color="brown";
       System.out.println("Animal constructor is called");
    } 
    void eat(){
        System.out.println("eats");
    } 
    abstract void walk(); // no implementation here,only gives idea
}
class Horse extends Animal{ //child class
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changecolor(){
     color="darkbrown";   
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
class Chicken extends Animal{ //child class
    void changecolor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
} */

//interface
/*public class oops{
    public static void main(String args[]){
        Queen q1=new Queen();
        q1.moves();
        Rook r1=new Rook();
        r1.moves();    
    }
}
interface Chessplayer{
    void moves(); //without implementation
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("left,right,up,down,diagonal(in all 4 directions)");
    }
}
class Rook/*(hathi)*/  /*implements Chessplayer{
    public void moves(){
        System.err.println("up,down,left,right");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}*/

//multiple inheritance example using interface
/*public class oops{
    public static void main(String args[]){
        Warrior warrior=new Warrior();
        Mage mage=new Mage();
        warrior.attack();
        warrior.use();
        mage.attack();
        mage.use();
    }
}
interface Character{
    void attack(); //no implementation here
}
interface Weapon{
    void use();
}
class Warrior implements Character,Weapon{
    public void attack(){
        System.out.println("Warrior attacks with a sword.");
    }
    public void use(){
        System.out.println("Warrior uses a sword.");
    }
}
class Mage implements Character,Weapon{
    public void attack(){
        System.out.println("Mage attacks with a wand.");
    }
    public void use(){
        System.out.println("Mage uses a wand.");
    }
} */

//static keyword example in properties
/*public class oops{
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolName="Sri Sankara Vidyalaya";
        Student s2=new Student();
        s2.schoolName="kps";
        System.out.println(s2.schoolName); //sri sankara vidyalaya
        Student s3=new Student();
        s3.schoolName="KV";
        System.out.println(s2.schoolName); // kv
        System.out.println(s1.schoolName);// kv
    }
}

class Student{
    String name;
    int roll;
    static String schoolName; //using static keyword
    void setname(String name){ //setter
        this.name=name;
    }
    String getname(){ //getter
        return this.name;
    }
} */

//static keyword example in properties
/*public class oops{
    public static void main(String args[]){
        Student s1=new Student();
        //accessing the non-static variable
        System.out.println("min + 1 = "+(s1.min+1));
        //accessing the static variable
        System.out.println("max + 1 = "+(Student.max+1));
    }
}
class Student{
    //static variable
    static int max=10;
    //non static variable
    int min=5;
} */

//static keyword example in functions
/*public class oops{
    public static void main(String args[]){
       Student s1=new Student();
       System.out.println(Student.returnpercentage(56,67,78)); 
    }
}
class Student{
    //static method
    static int returnpercentage(int maths,int phy,int chem){
        return (maths+phy+chem)/3;
    }
} */

//static keyword examples in static blocks.
/*class Student{
    //static variables
    static int a=23;
    static int b;
    static int max;
    //static blocks
    static{
        System.out.println("First static block..");
        b=a*4; //static blocks are used for initialisation.
    }
    static{
        System.out.println("Second static block..");
        max=30; //static blocks are used for initialisation.
    }
    //static methods
    static void display(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("max = "+max);
    }
}
    public class oops{
    public static void main(String args[]){
        //calling the static method
        Student.display();    
    }
} */

//super keyword in constructor
/*class Animal{
    Animal(){
        System.out.println("Animal constructor is called..");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor is called..");
    }
}
public class oops{
    public static void main(String args[]){
        Horse h1=new Horse();
    }
} */
//super keyword in properties
/*class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called..");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="brown";
        System.out.println("Horse constructor is called..");
    }
}
public class oops{
    public static void main(String args[]){
        Horse h1=new Horse();
        System.out.println(h1.color);
    }
} */
//super keyword in functions
/*class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called..");
    }
    void eat(){
        System.out.println("eats..");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="brown";
        System.out.println("Horse constructor is called..");
        super.eat();
    }
    void sleep(){
        System.out.println("Horse can sleep in standing position");
    }
}
public class oops{
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.sleep();
        h1.eat();
        System.out.println(h1.color);

    }
}*/

//getters and setters
/*class Pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    void setcolor(String color){
        this.color=color;
    }
    int gettip(){
        return this.tip;
    }
    void settip(int tip){
        this.tip=tip;
    }
}
public class oops{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor()); //blue
        p1.settip(5);
        System.out.println(p1.gettip()); //5
        p1.setcolor("Yellow");
        System.out.println(p1.getcolor()); //yellow
    }
}*/

//copy constructor
/*public class oops{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Deepanshi";
        s1.roll=123;
        s1.password="abcdefg";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1); //copy
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        s2.password="xyz";
        s1.marks[2]=100;
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[]; //array
    //shallow copy constructor
    Student(Student s1){ 
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    Student(){
        marks=new int[3];
        System.out.println("Constructor is called..");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }

}*/
//deep copy constructor
/*public class oops{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Deepanshi";
        s1.roll=123;
        s1.password="abcdefg";
        s1.marks[0]=67;
        s1.marks[1]=78;
        s1.marks[2]=89;
        Student s2=new Student(s1); //copy
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        s2.password="xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);


    }
}
class Student{
    int roll;
    String name;
    String password;
    int marks[];//array
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
        Student(){
            marks=new int[3];
            System.out.println("constructor is called");
        }
        Student(String name){
            marks=new int[3];
            this.name=name;
        }
        Student(int roll){
            marks=new int[3];
            this.roll=roll;
        }
} */
//there are two types of nested classes you can create in java:
//1. non-static nested class(inner class)
//2. static nested class
//non-static nested class(inner class)
/*class CPU{
    double price;
    //nested class
    class Processor{
        //members of nested class
        double cores;
        String manufacturer;
        double getCache(){
            return 4.3;
        }
    }
    //nested protec ted class
    protected class RAM{
        //members of protected nested class
        double memory;
        String manufacturer;
        double getClockSpeed(){
            return 5.5;
        }
    }
}
public class oops{
    public static void main(String args[]){
        //create object of outer class CPU
        CPU cpu=new CPU();
        //create an object of inner class processor using outer class CPU
        CPU.Processor processor=cpu.new Processor();
        //create an object of inner class RAM using outer class CPU
        CPU.RAM ram=cpu.new RAM();
        System.out.println("Processor Cache = "+processor.getCache());
        System.out.println("Ram Clock Speed = "+ram.getClockSpeed());

    }
} */
//Accessing members of outer class within inner class
/*class Car{
    String carName;
    String carType;
    //assign values using constructor
    public Car(String name,String type){
        this.carName=name;
        this.carType=type;
    }
        //private method
        private String getCarName(){
            return this.carName;
        }
    //inner class
    class Engine{
        String engineType;
        void setEngine(){
            //Accessing the carType property of the car
            if(Car.this.carType.equals("4WD")){
                //Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")){
                        this.engineType="smaller";
                }else{
                    this.engineType="bigger";
                }
            }else{
                    this.engineType="bigger";          
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}
public class oops{
    public static void main(String args[]){
        //create an object of the outer class Car
        Car c1=new Car("Mazda","8WD");
        //create an object of the inner class using the outer class
        Car.Engine c1engine=c1.new Engine();
        c1engine.setEngine();
        System.out.println("Engine Type for 8WD = "+c1engine.getEngineType());
        Car c2=new Car("Crysler","4WD");
        Car.Engine c2engine=c2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = "+c2engine.getEngineType());
    }
} */
//static nested class
//syntax to declare object of nested class using outer classname.
/*class MotherBoard{
    //static nested class
    static class USB{
        int usb2=2;
        int usb3=1;
        int getTotalPorts(){
            return usb2+usb3;
        }
    }
} 
public class oops{
    public static void main(String args[]){
        //create an object of the static nested class
        //using the name of the outer class
        MotherBoard.USB usb=new MotherBoard.USB();
        System.out.println("Total Ports = "+usb.getTotalPorts());
    }
} */
//Accessing members of outer class inside static inner class.
/*class MotherBoard{
    String model;
    public MotherBoard(String model){
        this.model=model;
    }
    //static nested class
    static class USB{
        int usb2=2;
        int usb3=1;
        int getTotalPorts(){
            //accessing the variable model of the outer class
            if(MotherBoard.this.model.equals("MSI")){
                return 4;
            }else{
                return usb2+usb3;
            }
        }
    }
}
public class oops{
    public static void main(String args[]){
        //create an object of the static nested class
        MotherBoard.USB usb=new MotherBoard.USB();
        System.out.println("Total Ports = "+usb.getTotalPorts());
    }
}*/    //output -> thus,program will give error












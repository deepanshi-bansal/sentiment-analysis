/*import java.util.*;
public class string{
    public static void main(String args[]){
    char arr[]={'a','b','c','d'};
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
    }
    System.out.println();
    String str="abcd";
    String str2=new String("xyz");
    System.out.println(str);
    System.out.println(str2);
    Scanner sc=new Scanner(System.in);
    String description;
    description=sc.nextLine();//input string
    System.out.println(description);
    String name;
    name= sc.next();
    System.out.println(name);
    sc.close();
    }
}*/
/*public class string{
    public static void main(String args[]){
       String name="deepanshi bansal";
        System.out.println(name.length()); //calculating string length
        String firstname="deepanshi";
        String lastname="bansal";
        String fullname=firstname+" "+lastname; //string concatenation
        System.out.println(fullname);
    }
} */
//using string charAt method
/*public class string{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        String firstname="deepanshi";
        String lastname="bansal";
        String fullname=firstname+" "+lastname;
        printletters(fullname);
    }
} */
//check if a string is palindrome or not
/*public class string{
    public static boolean checkpalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
           int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String randomthing="1223221";
        System.out.println(checkpalindrome(randomthing));
    }
} */
//given a route containing 4 directions (E,W,N,S).find the shortest path to reach the destination.
/*public class string{
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
        char dir=path.charAt(i);
        if(dir=='S'){ //South
            y--;
        }
        else if(dir=='N'){ //North
            y++;
        }
        else if(dir=='E'){ //East
            x++;
        }
        else{ //West
            x--;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.println(getshortestpath(str));
        String str2="NS";
        System.out.println(getshortestpath(str2));
    }
} */
//string functions-compare
/*public class string{
    public static void main(String args[]){
        String str="Tony";
        String str2="Tony";
        String str3=new String("Tony");
        if(str==str2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(str.equals(str3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        System.out.println(str2.equals(str3)); //return type of equals in this case is true,when we are checking the value we will always use equals
        System.out.println(str2==str3); //returns false because object of str2 and str3 are same but their values are different,because on creating str3 using new keyword it uses different space in the memory 
}
} */
//string functions-substring
/*public class string{
    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        //Substring
        String word="Hello Deepanshi";
        System.out.println(substring(word,0,7));
        System.out.println(word.substring(0,7)); //substring function
       } 
} */
//print largest string
/*public class string{
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
} */
//StringBuilder
/*public class string{
public static void main(String args[]){
    StringBuilder sb=new StringBuilder("");
    for(char ch='a';ch<='z';ch++){
        sb.append(ch);
    }
    System.out.println(sb); //abcdefghijklmnopqrstuvwxyz
    System.out.println(sb.length()); //26
}
} */
//convert letters to uppercase
/*public class string{
public static String converttouppercase(String str){//abc
    StringBuilder sb=new StringBuilder("");
    char ch=Character.toUpperCase(str.charAt(0));//ch=A
    sb.append(ch);//A
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
public static void main(String args[]){
    String str="hi ! i am deepanshi bansal";
    System.out.println(converttouppercase(str));
}
} */
//string compression
public class string{
    public static String compress(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
        }
        return newstr;
    }
    public static void main(String args[]){
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
}



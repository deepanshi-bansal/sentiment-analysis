//Tiling Problem code
/*public class Recursion2 {
    public static int Tilingproblem(int n){
        if(n==0 || n==1){ //Base Case
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1=Tilingproblem(n-1);
        //horizontal choice
        int fnm2=Tilingproblem(n-2);
        
        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(Tilingproblem(4));
    }
} */
//Remove duplicates in a string
/*public class Recursion2{
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){ //base case
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){ //index of map[] is currChar-a'
            //duplicate
            removeDuplicates(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String args[]){
        String str="appnnacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
} */
//friends pairing problem
/*public class Recursion2{
    public static int friendsPairing(int n){
        if(n==1 || n==2){ //Base Case
            return n;
        }        
        //kaam
        //choice
        //single
        int fnm1=friendsPairing(n-1);
        //pair
        int fnm2=friendsPairing(n-2);
        int pairways=(n-1)*friendsPairing(n-2);
        //totalways   
        int totalways=fnm1+pairways;
        return totalways; 
    }
    public static void main(String args[]){
        System.out.println(friendsPairing(3));
    }
} */ 
//writing friends pairing problem in compact code
/*public class Recursion2{
    public static int friendsPairing(int n){
        if(n==1 || n==2){ //Base Case
            return n;
        }
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendsPairing(3));
    }
} */
//writing tiling problem in compact code
/*public class Recursion2{
    public static int Tilingproblem(int n){
        if(n==0 || n==1){ //Base Case
            return 1;
        }
        return Tilingproblem(n-1)+Tilingproblem(n-2);
    }
    public static void main(String args[]){
        System.out.println(Tilingproblem(4));
    }
} */
//print all binary strings of size N without consecutive ones.
public class Recursion2{
    public static void printBinStrings(int n,int lastplace,String str){
        //Base Case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        if(lastplace==0){
            printBinStrings(n-1,0,str+"0");
            printBinStrings(n-1,1,str+"1");
        }
        else{
            printBinStrings(n-1,0,str+"0");
        } 
        //or 
        //printBinStrings(n-1,0,str+"0");
        //if(lastplace==0){
            //printBinStrings(n-1,1,str+"1");
        //}
    }
    public static void main(String args[]){
        printBinStrings(3,0,"");
    }
} 
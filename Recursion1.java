//print numbers in decreasing order from n to 1 using recursion.
/*public class Recursion1 {
    public static void printDec(int n){
        if(n==1){ //Base Case
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String args[]){
        int n=10;
        printDec(n);    
    }
} */
//print numbers in increasing order from 1 to n using recursion.
/*public class Recursion1{
    public static void printInc(int n){
        if(n==1){ //Base Case
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        printInc(n);
    }
} */
//find factorial of n
/*public class Recursion1{
    public static int fact(int n){
        if(n==0){ //Base Case
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(fact(n));
    }
} */
//print sum of n natural numbers
/*public class Recursion1{
    public static int calcSum(int n){
        if(n==1){ //Base Case
            return 1;
        }
        int Snm1= calcSum(n-1);
        int Sn=n+Snm1;
        return Sn;
    }
    public static void main(String args[]){
        System.out.println(calcSum(5));
    }
} */
//check if array is sorted(in ascending order) or not using iterative approach
/*public class Recursion1{
    public static boolean arraysortedornot(int arr[],int n){
        if(n==0 || n==1){ //Base Case i.e. array has one or no element
            return true;
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
                return true;
    }
    public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    int n=arr.length;
    System.out.println(arraysortedornot(arr,n));
    }
} */
//check if array is sorted(in ascending order) or not using recursive method
/*public class Recursion1{
    public static boolean arraysortedornot(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return arraysortedornot(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(arraysortedornot(arr,0));
    }
} */
//print nth fibonacci number using recursion
/*public class Recursion1{
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1= fib(n-1);
        int fnm2= fib(n-2);
        int fn= fnm1+fnm2;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(fib(6));
    }
} */
//first occurrence of element in an array
/*public class Recursion1{
    public static int firstoccu(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccu(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,7,10,2,7,3};
        System.out.println(firstoccu(arr,5,0));
    }
} */ 
//print x to the power n,Time Complexity-->O(n)
/*public class Recursion1{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1= power(x,n-1);
        int xn= x * xnm1;
        return xn;
    }
    public static void main(String args[]){
        System.out.println(power(2,5));
    }
} */
//last occurrence of element in an array
public class Recursion1{
    public static int lastoccu(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastoccu(arr,key,i+1);
        if(isFound==-1){
            if(arr[i]==key){
                return i;
            }
            else{
                return -1;
            }
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5, 3};
        System.out.println(lastoccu(arr,5,0));
    }
} 
//print x to the power n(optimized),Time Complexity-->O(logn)
/*public class Recursion1{
    public static int Optimizedpower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower=Optimizedpower(a,n/2);
        int halfPowersq= halfPower * halfPower; // n is even
        //n is odd
        if(n % 2 !=0){
            halfPowersq= a* halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String args[]){
        System.out.println(Optimizedpower(2,6));
    }
} */


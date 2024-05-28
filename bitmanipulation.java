/*public class bitmanipulation {
    //check if a number is odd or even
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
        System.out.println(5&6); // BINARY AND (&)
        System.out.println(5|6); //BINARY OR (|)
        System.out.println(5^6); //BINARY XOR (^)
        System.out.println(5<<2); //BINARY LEFT SHIFT(<<)
        System.out.println(6>>1); //BINARY RIGHT SHIFT(>>)
        System.out.println(~0); //BINARY 1's COMPLEMENT(~)
        System.out.println(~5);
        oddoreven(14); //even
        oddoreven(3); //odd
        oddoreven(11); //odd    
    }
}*/
//operations on binary numbers
//1. get ith bit
/*public class bitmanipulation{
    public static int getIthbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getIthbit(10,3));
    }
} */
//2. set ith bit
/*public class bitmanipulation{
    public static int setIthbit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(setIthbit(10,2));
    }
} */
//3. clear ith bit
/*public class bitmanipulation{
    public static int clearIthbit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearIthbit(10,1));
    }
} */
//check if a number n is power of 2 or not
/*public class bitmanipulation{
    public static boolean isPowerof2(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(isPowerof2(10));
    }
} */
// 4. update ith bit
/*import java.util.*;
public class bitmanipulation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5; //0101
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            //set
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask=~(bitMask);
            int newNumber=newBitMask & n;
            System.out.println(newNumber);
        }
    }
} */
// clear last i bits
/*public class bitmanipulation{
    public static int clearlastIbits(int n,int i){
        int bitmask=(~0)<<i;
        return (n & bitmask);
    }
    public static void main(String args[]){
        System.out.println(clearlastIbits(15,2));
    }
} */
//count set bits in a number
/*public class bitmanipulation{
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n & 1)!=0){ //checking our LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countsetbits(16));
    }
} */
//clear range of bits
/*public class bitmanipulation{
    public static int clearBitsinRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearBitsinRange(10,2,4));
    }
} */
//Fast Exponentiation
public class bitmanipulation{
    public static int fastexpo(int a,int n){
        int ans=1;
        while(n>0){
        if((n & 1)!=0){ // check for LSB
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;
    }
    return ans;
}
public static void main(String args[]){
        System.out.println(fastexpo(5,3));
}
}



//Arrays-input,output and update.
//import java.util.*;
/*public class arrays{
    public static void main(String args[]){
        int marks[]=new int[100]; //declaration
        // int numbers[]={1,2,3}; //3
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("maths : "+marks[2]);
        marks[2]=marks[2]+1;
        System.out.println("maths : "+marks[2]);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : "+percentage+"%");
        System.out.println("length of array : "+marks.length);
        sc.close();
    }
}*/
//arrays as function arguments
//array is call by reference
//here,nonchangeable is call by value
/*public class arrays{
    public static void update(int marks[],int nonchangeable){
        nonchangeable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int nonchangeable=5;
        update(marks,nonchangeable);
        System.out.println(nonchangeable); //5
        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" "); //98,99,100
        }
        System.out.println();

    }
} */

//linear search 
/*public class arrays{
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key=10;
        int index=linearsearch(numbers,key);
        if(index==-1){
            System.out.println("NOT FOUND!");
        }else{
            System.out.println("FOUND! at index "+ index);
        }
    }
} */

//linear search
/*public class arrays{
    public static int linearsearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[]={"Dosa","Samosa","Chole Bhature","Dal Makhani","Soup"};
        String key="Dosa";
        int index=linearsearch(menu,key);
        if(index==-1){
            System.out.println("NOT FOUND!");
        }else{
            System.out.println("Found at index "+index);
        }
    }
} */

//largest number in array
//smallest number in array
/*public class arrays{
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE; //+infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest number is : "+smallest);
        return largest;
    }
    public static void main(String args[]){
       int numbers[]={2,4,6,8,10};
       System.out.println("largest number is : "+getLargest(numbers));
        }
    } */

//reverse an array
/*public class arrays{
    public static void reversearray(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4};
       System.out.print("Reversed array is : ");
        reversearray(numbers);
        //printing the array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
} */

//pairs in array
/*public class arrays{
    public static void printpairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")"+",");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+tp);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        printpairs(numbers);
    }
} */

//binary search
/*public class arrays{
    public static int binarysearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){ //left
                end=mid-1;
            }else{ //right
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,10};
        int key=10;
        System.out.println("index for "+key+" is : "+binarysearch(numbers,key));
    }
} */

//printing subarrays
public class arrays1{
    public static void printsubarrays(int numbers[]){
        int ts=0; //ts stands for total subarrays
        for(int i=0;i<numbers.length;i++){ //start
            int start=i;
            for(int j=i;j<numbers.length;j++){ //end
                int end=j;
                for(int k=start;k<=end;k++){ //printing subarray
                    System.out.print(numbers[k]+" "); //subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays : "+ts);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printsubarrays(numbers);
    }
}




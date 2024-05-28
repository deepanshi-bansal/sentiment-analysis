//bubble sort code
/*public class basicsortingalgorithms {
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){ //outer loop
            for(int j=0;j<arr.length-1-turn;j++){ //inner loop
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printarray(arr);
    }
} */
//selection sort code
/*public class basicsortingalgorithms{
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){ //outer loop-for counting no. of turns
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){ //inner loop-for unsorted array start
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
        printarray(arr);
    }
} */
//insertion sort code
/*public class basicsortingalgorithms{
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current =arr[i]; //stored in temp. variable current
            int j=i-1;
            while(j>=0 && arr[j]>current){ // j is used in sorted array
                arr[j+1]=arr[j];
                j--;            
            }
            // for placement
            arr[j+1]=current;
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        printarray(arr);
        }
} */
//insertion sort code
/*public class basicsortingalgorithms{
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<current){
                arr[j+1]=arr[j];
                j--;
            }
            //for placement
            arr[j+1]=current;
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        printarray(arr);
    }
} */
//selection sort code
/*public class basicsortingalgorithms{
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    minpos=j;
                }
            }
        //swap
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
        printarray(arr);
    }
} */
//counting sort code
/*public class basicsortingalgorithms{
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //count array
        int count[]=new int[largest+1]; //from 0 to 7
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        countingsort(arr);
        printarray(arr);
    }

} */
//inbuilt sorting - for ascending order
/*import java.util.*;
public class basicsortingalgorithms{
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        /*Arrays.sort(arr);
        printarray(arr); */
        /*Arrays.sort(arr,1,5);
        printarray(arr);
    }
} */
//inbuilt sorting - for descending order
import java.util.*;
public class basicsortingalgorithms{
    public static void printarray(Integer arr[]){ 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[]={5,4,1,3,2}; //here,arr is an object type variable
        /*Arrays.sort(arr,Collections.reverseOrder());
        printarray(arr); */
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printarray(arr);
     }
}





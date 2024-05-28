//merge sort 
/*public class divideandconquer {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
   }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){ //Base Case
            return;
        }
        //kaam
        int mid=si+(ei-si)/2; // (or) (si+ei)/2
        mergeSort(arr,si,mid); //left part
        mergeSort(arr,mid+1,ei); //right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        //left(0,3)=4 , right(4,6)=3---> 6-0+1
        int temp[]=new int[ei-si+1]; //temp array
        int i=si; //iterator for left part
        int j=mid+1; //iterator for right part
        int k=0; //iterator for temp array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            } 
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // bache hue elements ko copy karna
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
} */
//quick sort
/*public class divideandconquer{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){ // Base Case
            return;
        }
        //last element-->pivot
        int pIdx=partition(arr,si,ei);
        quickSort(arr,si,pIdx-1); //left part
        quickSort(arr,pIdx+1,ei); //right part
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; // to make place for elements smaller than piovot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
            i++;
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
         }
        }
        //for pivot
        i++;
        //swap
        int temp=pivot;
        arr[ei]=arr[i]; //arr[ei]=pivot-->we can't write        
        arr[i]=temp;
        return i;

    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
} */
//Sorted and Rotated Array Search
/*public class divideandconquer{
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){ //Base Case
            return -1;
        }
        //kaam
        int mid=si+(ei-si)/2; // (or) (si+ei)/2
        //case FOUND
        if(arr[mid]==tar){
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left part
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid-1);
            }
            else{ 
                //case b: right part--> arr[mid]<=tar && tar<=arr[ei]
                return search(arr,tar,mid+1,ei);
            }
        }
        //mid on L2
        else{ // arr[mid]<=arr[ei]
            //case c: right part
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr,tar,mid+1,ei);
            }
            else{
                //case d: left part--> arr[si]<=tar && tar<=arr[mid]
                return search(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0; // output-->4(index)
        int tarIdx=search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);   
    }
} */
//modified bubble sorting
public class divideandconquer{
    public static void modifiedbubblesorting(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            boolean swapped=false;
            for(int j=0;j<arr.length-turn-1;j++){
                if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        modifiedbubblesorting(arr);
        printArray(arr);
    }
}
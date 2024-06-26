//2-D arrays
/*import java.util.*;
public class TWODarrays {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void searchmatrix(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
        }
                    System.out.println("number "+ largest +" found!");
    
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        searchmatrix(matrix);
        search(matrix,7);
    }
} */
//diagonal sum
/*public class TWODarrays{
    public static int diagonalSum(int matrix[][]){ 
        int sum=0;
        /*for(int i=0;i<matrix.length;i++){ // time complexity -->o(n^2)
            for(int j=0;j<matrix[0].length;j++){
                //primary diagonal
                if(i==j){ //overlapping element is included in case of n is odd
                    sum+= matrix[i][j];
                }
                //secondary diagonal
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
                
            }
        }*/
        //more optimized code for diagonal sum // time complexity -->o(n)
        /*for(int i=0;i<matrix.length;i++){
            //primary diagonal
            sum+=matrix[i][i]; //overlapping element is included in case of n is odd
            //secondary diagonal
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i]; //j==matrix.length-1-i
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
        System.out.println(diagonalSum(matrix)); // 68
    }
}*/
//spiral matrix
/*public class TWODarrays{
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
            System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(matrix);
    }
} */
//search in sorted matrix
/*public class TWODarrays{
    public static boolean staircasesearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row < matrix.length && col>=0){
        if(matrix[row][col]==key){
            System.out.println("Key found at cell ("+row+","+col+")");
            return true;
        }
        //taking special cell=40
        //left
        else if(key<matrix[row][col]){ 
            col--;
        }
        //bottom
        else{
            row++;
        }
    }
        System.out.println("key not found!");
        return false;
}
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
        staircasesearch(matrix,key);
    }
}*/
public class TWODarrays{
    public static boolean staircasesearch(int matrix[][],int key){
        int row=matrix.length-1,col=0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("key found at cell ("+row+","+col+")");
                return true;
          }
          //taking special cell=32
          //upwards          
          else if(key<matrix[row][col]){
            row--;
          }
          //right
          else{
            col++;
          }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=20; 
        staircasesearch(matrix,key);
    }
}



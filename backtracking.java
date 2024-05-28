//backtracking on arrays
/*public class backtracking {
    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
          printArr(arr);  
            return;
        }
        //recursion (kaam)
        arr[i]=val;
        changeArr(arr,i+1,val+1); //function call step
        arr[i]=arr[i]-2; //backtracking step
    }
   public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }
   public static void main(String args[]){
    int arr[]=new int[5];
    changeArr(arr,0,1);
    printArr(arr);
   } 
} */
//find subsets
/*public class backtracking{
    public static void findsubsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
            }
            return;
        }
        //recursion(kaam)
        //yes choice
        findsubsets(str,ans+str.charAt(i),i+1);
        //no choice
        findsubsets(str,ans,i+1);
    }
    public static void main(String args[]){
        String str="abc";
        findsubsets(str,"",0);
    }
} */
//find permutations
/*public class backtracking{
    public static void findpermutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion(kaam)
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"-->"ab"+"de" = "abde"
            String Newstr=str.substring(0,i) + str.substring(i+1,str.length());
            findpermutations(Newstr,ans+curr);
        }
    }
    public static void main(String args[]){
        String str="abc";
        findpermutations(str,"");
    }
} */
//n-queens all ways
//attacking is not considered in this case
/*public class backtracking{
    public static void nQueens(char board[][],int row){
        //Base Case
        if(row==board.length){
            printBoard(board);
            return;
        }
        //column loop.. n queens ko bethana hai n rows mein
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueens(board,row+1); // function call
            board[row][j]='x'; // backtracking step
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("----chessboard----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=2;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0);
    }
}*/
//n-queens all ways
//attacking is considered in this case
/*public class backtracking{
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
           if(board[i][col]=='Q'){
            return false;
           }
        }
        //left upper diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right upper diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        //Base Case
        if(row==board.length){
            printBoard(board);  
            return;
        }
        //column loop.... n queens ko n rows mein bethayenge
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueens(board,row+1); // function call
            board[row][j]='x'; // backtracking step
        }
    }
}
public static void printBoard(char board[][]){
    System.out.println("---chessboard---");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0);
    }
} */
//time complexity of n queens problem --> O(n!)
//n queens problem- count ways
/*public class backtracking{
    public static void nQueens(char board[][],int row){
        //Base Case
        if(row==board.length){
            count++;
            return;
        }
        //column loop.. n queens ko place karna hai n rows mein
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueens(board,row+1); // function call
            board[row][j]='x'; // backtracking step
            }
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left upper diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
        //right upper diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
}             
    static int count=0;
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        //intitialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0);
        System.out.println("Total number of ways to count " +n+ " queens problem = "+count);
    }
} */
//n queens - print one solution
/*public class backtracking{
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left upper diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right upper diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;   
    }
    public static boolean nQueens(char board[][],int row){
        //Base Case
        if(row==board.length){
            return true;
        }
        //column loop... n queens ko n rows mein bethana
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q'; // place karna
            if(nQueens(board,row+1)){ // n-1 queens ko call karna
                return true;
            } 
            board[row][j]='x'; // unplace karna (backtracking step)
        }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("---chessboard---");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(nQueens(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }

    }
} */
// grid ways code
/*public class backtracking{
    public static int gridways(int i,int j,int n,int m){
        //Base case
        if(i==n-1 && j==m-1){ // condition for last cell
            return 1;
        }
        else if(i==n || j==m){ // boundary cross condition
            return 0;
        }
        int w1=gridways(i+1,j,n,m); // condition for down
        int w2=gridways(i,j+1,n,m); // condition for right
        return w1+w2;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(gridways(0,0,n,m));
    }
} */
// sudoku code
public class backtracking{
        public static boolean SudokuSolver(int sudoku[][],int row,int col){
            //Base Case
            if(row==9){
                return true;
            }
            //recursion
            int nextRow=row,nextCol=col+1;
            if(col+1==9){
                nextRow=row+1;
                nextCol=0;
            }
            if(sudoku[row][col] != 0){
                return SudokuSolver(sudoku,nextRow,nextCol);
            }
            for(int digit=1;digit<=9;digit++){
                if(isSafe(sudoku,row,col,digit)){
                    sudoku[row][col]=digit;
                    if(SudokuSolver(sudoku,nextRow,nextCol)){
                        return true;
                    }
                    sudoku[row][col]=0;
                }
            }
            return false;
        }
        public static boolean isSafe(int sudoku[][],int row,int col,int digit){
            //column
            for(int i=0;i<=8;i++){
                if(sudoku[i][col]==digit){
                    return false;
                }
            }
            //row
            for(int j=0;j<=8;j++){
                if(sudoku[row][j]==digit){
                    return false;
                }
            }
            //grid
            int sr=(row/3)*3;
            int sc=(col/3)*3;
            //3x3 grid
            for(int i=sr;i<sr+3;i++){
                for(int j=sc;j<sc+3;j++){
                    if(sudoku[i][j]==digit){
                        return false;
                    }
                }
            }
            return true;
        }
        public static void printSudoku(int sudoku[][]){
            for(int i=0;i<=8;i++){
                for(int j=0;j<=8;j++){
                    System.out.print(sudoku[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if(SudokuSolver(sudoku,0,0)){
            System.out.println("Solution exists...");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exist...");
        }
    }
}



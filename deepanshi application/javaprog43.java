public class javaprog43 {
    public static void hollow_rectangle(int tolrows,int tolcolumns){
        //outer loop
        for(int i=1;i<=tolrows;i++){
            //inner columns
            for(int j=1;j<=tolcolumns;j++){
                //cell-(i,j)
                if(i==1||i==tolrows||j==tolcolumns|j==1){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(7,10);
    }
}

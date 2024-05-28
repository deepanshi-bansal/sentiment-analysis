public class javaprog49 {
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){//lines
        for(int j=1;j<=n-i;j++){//spaces
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){//hollow rectangle-stars
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        hollow_rhombus(10);
    }
}

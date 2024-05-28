public class javaprog42 {
    public static void func(){//Method scope
        int s=45;
        System.out.println(s);
    }
    public static void main(String args[]){
        func();
        {//Block scope
            int r=56;
            System.out.println(r);
        }
    }
    
}

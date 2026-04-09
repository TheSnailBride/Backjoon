package Test;

public class local {
    public static void main(String[] args) {
        int k =10;

        k=function(k);
        System.out.println(k);

    }
    public static int function(int k){
        return k+10;
    }
}

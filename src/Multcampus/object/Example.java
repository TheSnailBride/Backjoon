package Multcampus.object;

public class Example {

    int a = 10;

    public static void main(String[] args) {

        Object obj = new Object();

        obj = new String();




        if(obj instanceof  Object){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

    }
}

package Multcampus.object;

public class Human implements Runnable,walkable{

    @Override
    public void move(){
        System.out.println("걷기도 뛰기도 한다");

        walkable.super.move();
        Runnable.super.move();
    }


}

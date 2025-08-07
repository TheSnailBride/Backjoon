package Test.homework.work0804;

public class Penguin extends Animal implements Swimmable,Walkable{

    Penguin(String name,int  age){
        super(name,age);
    }
    @Override
    public void walk(){
        System.out.println("펭귄이 땅에서 걷는다.");
    }
    @Override
    public void swim(){
        System.out.println("펭귄이 수영한다");
    }
    @Override
    public void makeSound(){
        System.out.println("펭귄이 소리낸다");
    }


}

package Test.homework.work0804;

public class Lion extends Animal implements Walkable {


    Lion(String name,int age){
        super(name,age);
    }

    @Override
    public void walk(){
        System.out.println("사자가 걷는다");
    }

    @Override
    public void makeSound(){
        System.out.println("사자가 소리낸다");
    }

}

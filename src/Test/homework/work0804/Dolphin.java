package Test.homework.work0804;

public class Dolphin extends Animal implements Swimmable{

    Dolphin(String name, int age){
        super(name, age);
    }
    @Override
    public void swim(){
        System.out.println("돌고래가 수영한다.");
    }

    @Override
    public void makeSound(){
        System.out.println("돌고래가 소리낸다.");
    }
}

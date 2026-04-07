package AbstractVsInterface;

public class Sparrow extends Animal implements Flyable{

    public Sparrow(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("나는 독립적인"+name+"가 다 먹는다");
    }

    @Override
    public void fly() {
        System.out.println("쨱쨱하고 난다 어쩔래");
    }

    @Override
    public void makeSound() {
        System.out.println("짹짹거린다");
    }
}

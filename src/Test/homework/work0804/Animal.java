package Test.homework.work0804;

public abstract class  Animal {
    String name;
    int age;

    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){}
    public void eat(){
        System.out.println("먹이를 먹는다.");
    }

}

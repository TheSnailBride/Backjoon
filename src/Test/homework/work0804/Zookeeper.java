package Test.homework.work0804;

public class Zookeeper {
    public static void main(String[] args) {
        Animal[] animals
                = {new Penguin("펭귄", 5),
                new Lion("사자", 8),
                new Dolphin("돌고래", 10)
        };


        for(Animal s: animals){


                System.out.println(s.name);
                s.makeSound();
                if(s instanceof Swimmable){
                    ((Swimmable) s).swim();
                }
                if(s instanceof Walkable){
                    ((Walkable) s).walk();
                }



        }

    }


}
